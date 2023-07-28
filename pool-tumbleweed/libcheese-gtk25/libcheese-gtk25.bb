SUMMARY = "UI library for the Cheese a webcam booth"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects. \
 \
This package contains a library providing widgets to allow third \
party applications to include parts of cheese functionality."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "libcheese-gtk25-44.1-1.1.aarch64.rpm"
RPM_HASH = "2f7e10c6367347c22e2cebb39baadb227bdcec1c0d3b241e508e63ea5e8944dad39e589f72f5da81531be993194917ffe2c59e2f166079bd701291ece6d4d28d"

RPROVIDES:${PN} += "libcheese-gtk.so.25 \
libcheese-gtk25"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libcanberra-gtk3.so.0 \
libcheese-common \
libcheese.so.8 \
libclutter-1.0.so.0 \
libclutter-gtk-1.0.so.0 \
libcogl.so.20 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6"

inherit rpm
