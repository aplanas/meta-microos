SUMMARY = "GObject-based library for libusb1"
DESCRIPTION = "GUsb is a GObject wrapper for libusb1 that makes it easy to do \
asynchronous control, bulk and interrupt transfers with proper \
cancellation and integration into a mainloop."
LICENSE = "LGPL-2.1-or-later"

PV = "0.3.10"

RPM_NAME = "libgusb2-0.3.10-2.4.aarch64.rpm"
RPM_HASH = "6aee02a0f03604bca3b139f4bf341a065a9f26a1b1c6cf2b97ef07b2743ed393c3629579bb97360ee0f8c367da6bb808d0243751625354fcf5a5aa473646eb14"

RPROVIDES:${PN} += "libgusb.so.2()(64bit) \
libgusb2 \
libgusb2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
