SUMMARY = "Sametime Plugin for Pidgin using the Meanwhile Library"
DESCRIPTION = "IBM Sametime plugin for Pidgin using the Meanwhile library."
LICENSE = "GPL-2.0-only"

PV = "2.14.12"

RPM_NAME = "libpurple-plugin-sametime-2.14.12-1.4.aarch64.rpm"
RPM_HASH = "96c0424b7848acd52bc80368b31b5fef36d258c48bb47e4c1a7f64169343f7fc8230414ac119d7f55ad3a850b813a081b31e558f7bccae6c33ce82f9cfb62784"

RPROVIDES:${PN} += "libpurple-meanwhile \
libpurple-plugin-sametime \
libsametime.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libmeanwhile.so.1 \
libpurple"

inherit rpm
