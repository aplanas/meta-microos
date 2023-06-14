SUMMARY = "Library for handling evdev kernel devices"
DESCRIPTION = "Library for handling evdev kernel devices. It abstracts the ioctls \
through type-safe interfaces and provides functions to change \
the appearance of the device. \
 \
Aditional utilities for libevdev library"
LICENSE = "MIT"

PV = "1.13.0"

RPM_NAME = "libevdev-tools-1.13.0-1.4.aarch64.rpm"
RPM_HASH = "69948c22c5f2e0966b68a87050f1437fd76ebfd449a8b0f88b87baedc350bacb090d3b1facbbd0977d92b18f3855d8c6e5558bade40791a7baafe042dde260a0"

RPROVIDES:${PN} += "libevdev-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libevdev.so.2"

inherit rpm
