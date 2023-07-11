SUMMARY = "Library for handling evdev kernel devices"
DESCRIPTION = "Library for handling evdev kernel devices. It abstracts the ioctls \
through type-safe interfaces and provides functions to change \
the appearance of the device. \
 \
Aditional utilities for libevdev library"
LICENSE = "MIT"

PV = "1.13.1"

RPM_NAME = "libevdev-tools-1.13.1-1.1.aarch64.rpm"
RPM_HASH = "b1373b97ea8fcd33282c12cbeb34272a1eefa4cbfdaef708baedb2e7779abe76ee513f6ec0b122d95db3fef0874ec4be2e06810b85a08a407c262ad8dd0e3336"

RPROVIDES:${PN} += "libevdev-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2"

inherit rpm
