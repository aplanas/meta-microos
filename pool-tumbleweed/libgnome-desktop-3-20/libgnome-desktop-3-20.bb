SUMMARY = "The GNOME Desktop API Library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "libgnome-desktop-3-20-44.0-1.2.aarch64.rpm"
RPM_HASH = "cabdd34a7ece34cfe31aaaf8eee8cd617aa8d7e49b2a238731daa908844ec913cd73269ed92a0ca90dc610cd89f2dec90c43e81404e8ea8e93ce675209a4187d"

RPROVIDES:${PN} += "gnome-desktop \
gnome-version \
libgnome-desktop-3-20 \
libgnome-desktop-3.so.20"

RDEPENDS:${PN} += "/sbin/ldconfig \
bubblewrap \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3-0-common \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libseccomp.so.2 \
libsystemd.so.0 \
libudev.so.1 \
libxkbregistry.so.0"

inherit rpm
