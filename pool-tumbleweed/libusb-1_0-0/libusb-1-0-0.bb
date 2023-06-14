SUMMARY = "USB Library"
DESCRIPTION = "Libusb is a library that allows userspace access to USB devices."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.26"

RPM_NAME = "libusb-1_0-0-1.0.26-1.5.aarch64.rpm"
RPM_HASH = "0ff6a87a376296df6eaac7ef88e70e933690d69b18dafe5ca771d8d37f1ef4db0e506890d6905d7e78c99aece057905f4074baf750b155e3915afe7405a0a90b"

RPROVIDES:${PN} += "libusb-1-0-0 \
libusb-1.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1"

inherit rpm
