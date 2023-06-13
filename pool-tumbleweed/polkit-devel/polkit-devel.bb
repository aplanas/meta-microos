SUMMARY = "Development files for PolicyKit"
DESCRIPTION = "Development files for PolicyKit Authorization Framework."
LICENSE = "LGPL-2.1-or-later"

PV = "121"

RPM_NAME = "polkit-devel-121-4.2.aarch64.rpm"
RPM_HASH = "25814ca56ff5a99bed3f1665e573993435469302c26ca73004ad5e562a806d4f681d0863593322fcc8c40d13e9e4b869013d42daa3ddfca2fe5d66ce890e7c4d"

RPROVIDES:${PN} += "pkgconfig(polkit-agent-1) \
pkgconfig(polkit-gobject-1) \
polkit-devel \
polkit-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libpolkit-agent-1-0 \
libpolkit-gobject-1-0 \
pkgconfig \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(polkit-gobject-1) \
polkit \
typelib-1_0-Polkit-1_0"

inherit rpm
