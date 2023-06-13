SUMMARY = "UI library for the Cheese a webcam booth"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects. \
 \
This package contains a library providing widgets to allow third \
party applications to include parts of cheese functionality."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.1"

RPM_NAME = "libcheese-gtk25-44.0.1-1.1.aarch64.rpm"
RPM_HASH = "1343fceca536e574289fc2ab0cd51642a8e8356e23bb264cd74900293b432f683d710ad43b31df9aba560fefee40714f83d2e2032a0cf917ae0b595634882056"

RPROVIDES:${PN} += "libcheese-gtk.so.25()(64bit) \
libcheese-gtk25 \
libcheese-gtk25(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libcanberra-gtk3.so.0()(64bit) \
libcheese-common \
libcheese.so.8()(64bit) \
libclutter-1.0.so.0()(64bit) \
libclutter-gtk-1.0.so.0()(64bit) \
libcogl.so.20()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit)"

inherit rpm
