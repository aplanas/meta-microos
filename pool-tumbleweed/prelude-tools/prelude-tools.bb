SUMMARY = "Tools for libprelude"
DESCRIPTION = "Libprelude is a library that guarantees secure connections between all sensors \
and the Prelude Manager. Libprelude provides an Application Programming Interface \
(API) for the communication with Prelude sub-systems, it supplies the necessary \
functionality for generating and emitting IDMEF events with Prelude and automates \
the saving and re-transmission of data in times of temporary interruption of one \
of the components of the system."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-tools-5.2.0-2.17.aarch64.rpm"
RPM_HASH = "e7673a94af78bbca1da2ec9804cc99981d5369d3c55cc71ee847805951b7902134148ef0c764057eb221aabe3534fa65593857c2f7f02747127523981062cb69"

RPROVIDES:${PN} += "config-prelude-tools \
prelude-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libprelude.so.28 \
libprelude28"

inherit rpm
