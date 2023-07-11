SUMMARY = "Prelude Libraries"
DESCRIPTION = "Libprelude is a library that guarantees secure connections between all sensors \
and the Prelude Manager. Libprelude provides an Application Programming Interface \
(API) for the communication with Prelude sub-systems, it supplies the necessary \
functionality for generating and emitting IDMEF events with Prelude and automates \
the saving and re-transmission of data in times of temporary interruption of one \
of the components of the system."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludecpp12-5.2.0-2.16.aarch64.rpm"
RPM_HASH = "1da7f10b0d63bb633886c17392fc30de059eacfc6d02a20933d894e1c10241ccbfd5a6e195551ccb0a1c2e6577dec196306c14e973f55cdb65cef3f16bc44e7d"

RPROVIDES:${PN} += "libpreludecpp.so.12 \
libpreludecpp12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libprelude.so.28 \
libstdc++.so.6"

inherit rpm
