SUMMARY = "A libpurple plugin to connect to Mattermost"
DESCRIPTION = "A third-party plugin for the Pidgin multi-protocol instant \
messenger. \
It connects libpurple-based instant messaging clients with the \
Mattermost server. \
 \
This package provides the protocol plugin for libpurple clients."
LICENSE = "GPL-3.0-or-later"

PV = "2.1"

RPM_NAME = "libpurple-plugin-mattermost-2.1-1.5.aarch64.rpm"
RPM_HASH = "0f0174f0added2e081a769f974160ea0ba92ea5af78e4e6e5e5eeb1d8b452977c390d3c8656034b5a899c415c29b628bd58d2dc808cab7d367cbde703426d548"

RPROVIDES:${PN} += "libmattermost.so \
libpurple-plugin-mattermost"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libjson-glib-1.0.so.0 \
libmarkdown.so.3 \
libpurple.so.0"

inherit rpm
