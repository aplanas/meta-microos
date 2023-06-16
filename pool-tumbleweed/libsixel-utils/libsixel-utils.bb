SUMMARY = "Utilities for the SIXEL encoder/decoder libsixel"
DESCRIPTION = "img2sixel and sixel2png utilities for libsixel, a C encoder/decoder implementation for DEC SIXEL graphics."
LICENSE = "MIT"

PV = "1.10.3"

RPM_NAME = "libsixel-utils-1.10.3-1.7.aarch64.rpm"
RPM_HASH = "81e67d74f628c07c0e3b9c98805644e6cad3f4212ab2dea769d6e6c69a8c66775bd2558e47a43d75572c633f86290a000975f04a16cb0d8cf82cc37de84d9570"

RPROVIDES:${PN} += "libsixel-utils"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsixel.so.1 \
libsixel1"

inherit rpm
