SUMMARY = "Development files for libgusb, a GObject-based wrapper for libusb1"
DESCRIPTION = "GUsb is a GObject wrapper for libusb1 that makes it easy to do \
asynchronous control, bulk and interrupt transfers with proper \
cancellation and integration into a mainloop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.10"

RPM_NAME = "libgusb-devel-0.3.10-2.5.aarch64.rpm"
RPM_HASH = "9d44ddbcefe28e705c225f1c1a846da488429b93f0102754b76380564a3f25c772769fab321dcce4d0e6b5fa0d6a7c4e4949cbebd6dd73d5c828896b8ecf0867"

RPROVIDES:${PN} += "libgusb-devel \
pkgconfig-gusb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgusb.so.2 \
libgusb2 \
pkgconfig-gio-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libusb-1.0 \
typelib-1-0-GUsb-1-0"

inherit rpm
