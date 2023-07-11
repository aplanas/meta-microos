SUMMARY = "GObject-based library for libusb1"
DESCRIPTION = "GUsb is a GObject wrapper for libusb1 that makes it easy to do \
asynchronous control, bulk and interrupt transfers with proper \
cancellation and integration into a mainloop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.10"

RPM_NAME = "libgusb2-0.3.10-2.5.aarch64.rpm"
RPM_HASH = "ebb57d909e0325c2f16f3849fc46e3d352f4420bf6111449ca7f58a35eea0b854bfe6265b1b6ab5db5fa5a9928b3f506226e3d730a5c8334f4ed755b27ecd6a6"

RPROVIDES:${PN} += "libgusb.so.2 \
libgusb2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libusb-1.0.so.0"

inherit rpm
