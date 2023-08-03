SUMMARY = "Simple library for communicating with USB and Bluetooth HID devices"
DESCRIPTION = "HIDAPI is a library which allows an application to interface with USB and Bluetooth HID-Class devices. \
While it can be used to communicate with standard HID devices like keyboards, mice, and Joysticks, it is most useful when used with custom (Vendor-Defined) HID devices."
LICENSE = "BSD-3-Clause | GPL-3.0-or-later"

PV = "0.14.0"

RPM_NAME = "libhidapi-libusb0-0.14.0-1.1.aarch64.rpm"
RPM_HASH = "a01b987221e9e3da811df4d73d395c06dfd1596f51c4393c2d5edbcbf3cc25c246a9c755fe04c1da91dda5973caef6caedb6cb2a9f78a8f40381bfc3217f0c7a"

RPROVIDES:${PN} += "libhidapi-libusb.so.0 \
libhidapi-libusb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
