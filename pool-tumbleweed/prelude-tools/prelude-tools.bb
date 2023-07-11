SUMMARY = "Tools for libprelude"
DESCRIPTION = "Libprelude is a library that guarantees secure connections between all sensors \
and the Prelude Manager. Libprelude provides an Application Programming Interface \
(API) for the communication with Prelude sub-systems, it supplies the necessary \
functionality for generating and emitting IDMEF events with Prelude and automates \
the saving and re-transmission of data in times of temporary interruption of one \
of the components of the system."
LICENSE = "LGPL-2.1-only & LGPL-2.1-or-later"

PV = "5.2.0"

RPM_NAME = "prelude-tools-5.2.0-2.16.aarch64.rpm"
RPM_HASH = "55478d74c2243446ce1d44ea79b6545725ec891d23f53ed07c079088f99952f0cad4e2f2b9ac1eaca35a9e68fae5d16ba15640c5ff650ccba6fa3e19b21b985e"

RPROVIDES:${PN} += "config-prelude-tools \
prelude-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgnutls.so.30 \
libprelude.so.28 \
libprelude28"

inherit rpm
