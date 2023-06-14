SUMMARY = "Daemon for PGP prompting by libcryptui"
DESCRIPTION = "Libcryptui is a library used for prompting for PGP keys."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.2"

RPM_NAME = "seahorse-daemon-3.12.2-10.3.aarch64.rpm"
RPM_HASH = "729dce2b13a04ee83af0433d50eb7493699eb917822f5d0787b96350da7b7138d8de1b1aeb9bf9e367f79abaafb9af2eb38942e15e9fba4ef89ddaa4b2dceef6"

RPROVIDES:${PN} += "seahorse-daemon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libcryptui-data \
libcryptui.so.0 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-keyring.so.0 \
libgobject-2.0.so.0 \
libgpgme.so.11 \
libgtk-3.so.0 \
libnotify.so.4"

inherit rpm
