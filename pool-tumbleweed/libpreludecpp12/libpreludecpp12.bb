SUMMARY = "Prelude Libraries"
DESCRIPTION = "Libprelude is a library that guarantees secure connections between all sensors \
and the Prelude Manager. Libprelude provides an Application Programming Interface \
(API) for the communication with Prelude sub-systems, it supplies the necessary \
functionality for generating and emitting IDMEF events with Prelude and automates \
the saving and re-transmission of data in times of temporary interruption of one \
of the components of the system."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludecpp12-5.2.0-2.17.aarch64.rpm"
RPM_HASH = "832c0e9dd4bb83b6db35d8c3ddd748637fed356044bf7e31b6311e5f13d53711cd07bd38c012d555a38161432861dc5cb8a0ad90f3e8074adb244cd2c4c16359"

RPROVIDES:${PN} += "libpreludecpp.so.12 \
libpreludecpp12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libprelude.so.28 \
libstdc++.so.6"

inherit rpm
