SUMMARY = "Simple library for communicating with USB and Bluetooth HID devices"
DESCRIPTION = "HIDAPI is a library which allows an application to interface with USB and Bluetooth HID-Class devices. \
While it can be used to communicate with standard HID devices like keyboards, mice, and Joysticks, it is most useful when used with custom (Vendor-Defined) HID devices."
LICENSE = "BSD-3-Clause | GPL-3.0-or-later"

PV = "0.13.1"

RPM_NAME = "libhidapi-libusb0-0.13.1-1.3.aarch64.rpm"
RPM_HASH = "87242ab4bb946f61af9c82de447e0841bf13cb8686d2f8e02865b769283292c760703e979e1d123054bf6d75ea340cd4a4ab893865e9c75502e28512a4d1cfbd"

RPROVIDES:${PN} += "libhidapi-libusb.so.0 \
libhidapi-libusb0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libusb-1.0.so.0"

inherit rpm
