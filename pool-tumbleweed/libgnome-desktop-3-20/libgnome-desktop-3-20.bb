SUMMARY = "The GNOME Desktop API Library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "libgnome-desktop-3-20-44.0-1.1.aarch64.rpm"
RPM_HASH = "87b351b8ffa801587755621122b1ef423c54f7b2717961c0a56a6604d2b92ec1432bbbb0b0fd18642ab471946d0c2424227e3e83414c1724820b6a245421e7cf"

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
