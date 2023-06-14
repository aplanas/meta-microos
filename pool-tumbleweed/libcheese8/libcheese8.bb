SUMMARY = "Library implementing a webcam booth for GNOME"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.1"

RPM_NAME = "libcheese8-44.0.1-1.1.aarch64.rpm"
RPM_HASH = "ee80bb44237e96fb6855518132d50072b36356dbda97cdae7e90ccc448efcf66fec3c7595ae6389a346e2b7a27a9dc2faf6ec6fc9929064f5783abe1ba33cd4e"

RPROVIDES:${PN} += "libcheese.so.8 \
libcheese8"

RDEPENDS:${PN} += "/sbin/ldconfig \
gstreamer-plugins-bad \
gstreamer-plugins-good \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcheese-common \
libclutter-1.0.so.0 \
libclutter-gst-3.0.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstpbutils-1.0.so.0 \
libgstreamer-1.0.so.0"

inherit rpm
