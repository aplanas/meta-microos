SUMMARY = "Prelude Libraries"
DESCRIPTION = "Libprelude is a library that guarantees secure connections between all sensors \
and the Prelude Manager. Libprelude provides an Application Programming Interface \
(API) for the communication with Prelude sub-systems, it supplies the necessary \
functionality for generating and emitting IDMEF events with Prelude and automates \
the saving and re-transmission of data in times of temporary interruption of one \
of the components of the system."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "libpreludecpp12-5.2.0-2.14.aarch64.rpm"
RPM_HASH = "81383b53513776c968beb1478bc3e6036d9dee72450010e063816551a733588246520aa6d1002d3d6e31f9e0560cb74ec9b608532035c2e652a8981622b6c09b"

RPROVIDES:${PN} += "libpreludecpp.so.12 \
libpreludecpp12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libprelude.so.28 \
libstdc++.so.6"

inherit rpm
