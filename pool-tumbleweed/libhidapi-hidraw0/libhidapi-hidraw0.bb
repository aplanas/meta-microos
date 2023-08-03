SUMMARY = "Simple library for communicating with USB and Bluetooth HID devices"
DESCRIPTION = "HIDAPI is a library which allows an application to interface with USB and Bluetooth HID-Class devices. \
While it can be used to communicate with standard HID devices like keyboards, mice, and Joysticks, it is most useful when used with custom (Vendor-Defined) HID devices."
LICENSE = "BSD-3-Clause | GPL-3.0-or-later"

PV = "0.14.0"

RPM_NAME = "libhidapi-hidraw0-0.14.0-1.1.aarch64.rpm"
RPM_HASH = "c83a0c86973e441922157ac6e8024dc9a58baad11b145567d64416431d4fd41b7cd5fb406a07f833a22faed1c0a27f7264868ca457936cbb870a9be9e44a9095"

RPROVIDES:${PN} += "libhidapi-hidraw.so.0 \
libhidapi-hidraw0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1"

inherit rpm
