SUMMARY = "Library implementing a webcam booth for GNOME"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects."
LICENSE = "GPL-2.0-or-later"

PV = "44.0.1"

RPM_NAME = "libcheese8-44.0.1-1.2.aarch64.rpm"
RPM_HASH = "b436ef0ec96c1b1b6938110c685c09192cf60268ad87a882e6347a19638ed462a682512d829843a20e04802c0ed97769e8675c488415fe2ade0bf6b72d797c49"

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
