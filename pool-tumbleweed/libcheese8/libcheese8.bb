SUMMARY = "Library implementing a webcam booth for GNOME"
DESCRIPTION = "Cheese is an application to take photos and videos with your webcam, \
with fun graphical effects."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "libcheese8-44.1-1.1.aarch64.rpm"
RPM_HASH = "32b68d5ab4e0fe57ca3451bbec209a2f77b3c2d8e83d3bb99ce3689225fa1697bf616372d5f6121efb1f8f3260150da52635aebf7a9ca511443715b4cae36b38"

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
