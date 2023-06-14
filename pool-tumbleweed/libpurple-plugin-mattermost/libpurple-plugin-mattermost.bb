SUMMARY = "A libpurple plugin to connect to Mattermost"
DESCRIPTION = "A third-party plugin for the Pidgin multi-protocol instant \
messenger. \
It connects libpurple-based instant messaging clients with the \
Mattermost server. \
 \
This package provides the protocol plugin for libpurple clients."
LICENSE = "GPL-3.0-or-later"

PV = "2.1"

RPM_NAME = "libpurple-plugin-mattermost-2.1-1.4.aarch64.rpm"
RPM_HASH = "2751ac3b00cec9207ee787b8d5a1f3b4e676fc244836c0f00f2c6f8d04ce30600bc983c076e16f76f157cdb331bd849db20721dafa68c7b8974fae55af2b330e"

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
