SUMMARY = "Development files for libgusb, a GObject-based wrapper for libusb1"
DESCRIPTION = "GUsb is a GObject wrapper for libusb1 that makes it easy to do \
asynchronous control, bulk and interrupt transfers with proper \
cancellation and integration into a mainloop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.10"

RPM_NAME = "libgusb-devel-0.3.10-2.4.aarch64.rpm"
RPM_HASH = "8ad60275d1682c0a5101e03e0b5244639970bc2b58ee4b94152cf7c186e9ab5280a1e86260b75177efce121dd90e418c98c431ce12473965a1d14c811b969b35"

RPROVIDES:${PN} += "libgusb-devel \
libgusb-devel(aarch-64) \
pkgconfig(gusb)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgusb.so.2()(64bit) \
libgusb2 \
pkgconfig(gio-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libusb-1.0) \
typelib-1_0-GUsb-1_0"

inherit rpm
