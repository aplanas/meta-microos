SUMMARY = "Development files for libevdev library"
DESCRIPTION = "Library for handling evdev kernel devices. It abstracts the ioctls \
through type-safe interfaces and provides functions to change \
the appearance of the device. \
 \
Development files for libevdev library"
LICENSE = "MIT"

PV = "1.13.1"

RPM_NAME = "libevdev-devel-1.13.1-1.1.aarch64.rpm"
RPM_HASH = "efd9cc029949bc98de41c6237e7b945d5d88bb626fe19aeb66599c13d11cc9e75c8f908c3549bf00b9b1f3dcf1faa46af1165771fb1b1e4dbed5aa7702a4347f"

RPROVIDES:${PN} += "libevdev-devel \
pkgconfig-libevdev"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libevdev2"

inherit rpm
