SUMMARY = "The GNOME Desktop API Library"
DESCRIPTION = "The libgnome-desktop library provides API shared by several applications \
on the desktop, but that cannot live in the platform for various \
reasons."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "libgnome-desktop-4-2-44.0-1.1.aarch64.rpm"
RPM_HASH = "c5c8da8a6a5b02b43fdad09a69aa4cf66499d4d0ed655831c670641fb721ed38bb90bdc69d080dfb9ed1f076d597ae885eb1062f6e8c0e59ae3cc60eaa323238"

RPROVIDES:${PN} += "gnome-desktop \
libgnome-bg-4.so.2 \
libgnome-desktop-4-2 \
libgnome-desktop-4.so.2 \
libgnome-rr-4.so.2"

RDEPENDS:${PN} += "/sbin/ldconfig \
bubblewrap \
gsettings-desktop-schemas \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgnome-desktop-3-0-common \
libgobject-2.0.so.0 \
libgtk-4.so.1 \
libm.so.6 \
libseccomp.so.2 \
libsystemd.so.0 \
libudev.so.1 \
libxkbregistry.so.0"

inherit rpm
