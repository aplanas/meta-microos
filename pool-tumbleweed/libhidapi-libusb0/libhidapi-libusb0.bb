SUMMARY = "Simple library for communicating with USB and Bluetooth HID devices"
DESCRIPTION = "HIDAPI is a library which allows an application to interface with USB and Bluetooth HID-Class devices. \
While it can be used to communicate with standard HID devices like keyboards, mice, and Joysticks, it is most useful when used with custom (Vendor-Defined) HID devices."
LICENSE = "BSD-3-Clause | GPL-3.0-or-later"

PV = "0.13.1"

RPM_NAME = "libhidapi-libusb0-0.13.1-1.2.aarch64.rpm"
RPM_HASH = "5386c25309d33244e6083ec40081121d438010dd7903e9d02329cffdafd8fb1128e57bb1cfaa3ffa0e8bd3e96023f1d32c6d0b06c124bba98ca3a1060826e0d0"

RPROVIDES:${PN} += "libhidapi-libusb.so.0()(64bit) \
libhidapi-libusb0 \
libhidapi-libusb0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libusb-1.0.so.0()(64bit)"

inherit rpm
