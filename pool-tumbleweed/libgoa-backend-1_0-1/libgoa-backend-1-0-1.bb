SUMMARY = "GNOME service to access online accounts -- Backend Library"
DESCRIPTION = "gnome-online-accounts provides interfaces so applications and \
libraries in GNOME can access the user's online accounts."
LICENSE = "LGPL-2.0-or-later"

PV = "3.48.0"

RPM_NAME = "libgoa-backend-1_0-1-3.48.0-1.2.aarch64.rpm"
RPM_HASH = "67d2184018c725181addfb2b3cedf6d384aa397821b5f647e1311f68d45e6f3377f986515ec815f62b18d6c5559bf3609d3d5ec150f7b7d8edd701cf47f278db"

RPROVIDES:${PN} += "libgoa-backend-1-0-1 \
libgoa-backend-1.0.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcr-base-3.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgoa-1.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjavascriptcoregtk-4.1.so.0 \
libjson-glib-1.0.so.0 \
librest-1.0.so.0 \
libsecret-1.so.0 \
libsoup-3.0.so.0 \
libwebkit2gtk-4.1.so.0 \
libxml2.so.2"

inherit rpm
