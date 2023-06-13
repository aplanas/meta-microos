SUMMARY = "Simple library for communicating with USB and Bluetooth HID devices"
DESCRIPTION = "HIDAPI is a library which allows an application to interface with USB and Bluetooth HID-Class devices. \
While it can be used to communicate with standard HID devices like keyboards, mice, and Joysticks, it is most useful when used with custom (Vendor-Defined) HID devices."
LICENSE = "BSD-3-Clause | GPL-3.0-or-later"

PV = "0.13.1"

RPM_NAME = "libhidapi-hidraw0-0.13.1-1.2.aarch64.rpm"
RPM_HASH = "06fe36750de20be4f8909c5ce8113e43003f36b75e1e3c7a7717894baba0e574dbca6bfb8ac97ef805262c70ca9268894d2bd89087e7b965ec7f3c3c209a45e0"

RPROVIDES:${PN} += "libhidapi-hidraw.so.0()(64bit) \
libhidapi-hidraw0 \
libhidapi-hidraw0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
