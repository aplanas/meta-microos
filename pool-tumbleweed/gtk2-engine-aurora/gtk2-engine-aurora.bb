SUMMARY = "Another GTK2 engine theme"
DESCRIPTION = "The Aurora Gtk Engine themes all common Gtk widgets \
to provide an attractive, complete and consistent \
look for Gtk applications."
LICENSE = "GPL-2.0"

PV = "1.5.1"

RPM_NAME = "gtk2-engine-aurora-1.5.1-16.30.aarch64.rpm"
RPM_HASH = "da05eb9e3ee5ba209a892d9adf78f9ac67deb6a0cf49be0d88c8d4ce659d7711633540114daa72f712c95d1249480ff69a63ded5b65b04056ea0d21ba10b3eac"

RPROVIDES:${PN} += "gtk2-engine-aurora \
libaurora.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
