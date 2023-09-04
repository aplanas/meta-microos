SUMMARY = "GNOME Web Browser"
DESCRIPTION = "Epiphany is a Web browser for the GNOME Desktop. Its principles are \
simplicity and standards compliance."
LICENSE = "GPL-3.0-or-later"

PV = "44.6"

RPM_NAME = "epiphany-44.6-1.1.aarch64.rpm"
RPM_HASH = "46f21477985652aec981608977f1eeedc032a587ce8cff43615030711bcbd5a6bb775bd997b449ee462cfedec3ceeb99a143f6b824829dc709736102e7219614"

RPROVIDES:${PN} += "epiphany \
libephymain.so \
libephymisc.so \
libephysync.so \
libephywebextension.so \
libephywebprocessextension.so"

RDEPENDS:${PN} += "epiphany-branding \
iso-codes \
ld-linux-aarch64.so.1 \
libadwaita-1.so.0 \
libarchive.so.13 \
libc.so.6 \
libcairo.so.2 \
libgcr-4.so.4 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmp.so.10 \
libgobject-2.0.so.0 \
libgraphene-1.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-4.so.1 \
libhogweed.so.6 \
libjavascriptcoregtk-6.0.so.1 \
libjson-glib-1.0.so.0 \
libnettle.so.8 \
libpango-1.0.so.0 \
libportal-gtk4.so.1 \
libportal.so.1 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libsqlite3.so.0 \
libwebkitgtk-6.0.so.4 \
libxml2.so.2"

inherit rpm
