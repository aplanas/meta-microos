SUMMARY = "Simple library for communicating with USB and Bluetooth HID devices"
DESCRIPTION = "HIDAPI is a library which allows an application to interface with USB and Bluetooth HID-Class devices. \
While it can be used to communicate with standard HID devices like keyboards, mice, and Joysticks, it is most useful when used with custom (Vendor-Defined) HID devices."
LICENSE = "BSD-3-Clause | GPL-3.0-or-later"

PV = "0.13.1"

RPM_NAME = "libhidapi-hidraw0-0.13.1-1.3.aarch64.rpm"
RPM_HASH = "fb4150f50c63f62aa598f7f9368364400b78a99305bcd7c95f7cd0202e5f57fb307d74ea1c271186f9cf686df52d2e754dbf892ae972bf5bde58b837aceacae3"

RPROVIDES:${PN} += "libhidapi-hidraw.so.0 \
libhidapi-hidraw0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1"

inherit rpm
