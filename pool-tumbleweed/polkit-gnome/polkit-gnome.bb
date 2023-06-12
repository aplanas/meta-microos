SUMMARY = "PolicyKit integration for the GNOME desktop"
DESCRIPTION = "polkit-gnome provides an authentication agent for PolicyKit \
that matches the look and feel of the GNOME desktop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.105"

RPM_NAME = "polkit-gnome-0.105-14.8.aarch64.rpm"
RPM_HASH = "45ef001b9b88812dc9a81c2aaaee659f474c7dd81e673b1895949ec613288fa76a28145dd232f21853bf3f2ade0a31123152691ede16321363142ff5f2020363"

RPROVIDES:${PN} += "polkit-gnome \
polkit-gnome(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpolkit-agent-1.so.0()(64bit) \
libpolkit-gobject-1.so.0()(64bit)"

inherit rpm
