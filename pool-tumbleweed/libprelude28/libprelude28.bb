SUMMARY = "Prelude Libraries"
DESCRIPTION = "Libprelude is a library that guarantees secure connections between all sensors \
and the Prelude Manager. Libprelude provides an Application Programming Interface \
(API) for the communication with Prelude sub-systems, it supplies the necessary \
functionality for generating and emitting IDMEF events with Prelude and automates \
the saving and re-transmission of data in times of temporary interruption of one \
of the components of the system."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "libprelude28-5.2.0-2.16.aarch64.rpm"
RPM_HASH = "bb9fbfa5bfdff695656613bbb7d51247f51a9016528d5c27b813a4df88cfcb6696c7195eba1eeeb695f21ba45a2691773a1581ef48c823b84a0319caf78a9520"

RPROVIDES:${PN} += "libprelude.so.28 \
libprelude28"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libpcre.so.1"

inherit rpm
