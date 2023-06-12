SUMMARY = "Tools for libavif"
DESCRIPTION = "This library aims to be a friendly, portable C implementation of the AV1 Image \
File Format, as described here: \
 \
https://aomediacodec.github.io/av1-avif/ \
 \
This package holds the commandline tools for libavif."
LICENSE = "BSD-2-Clause"

PV = "0.11.1"

RPM_NAME = "avif-tools-0.11.1-2.1.aarch64.rpm"
RPM_HASH = "e0b69dd4ca7dec5e4b389d90ad42268b96d26c78ddfe58b72f4dfe4c840a6a7a0b789f9d82aa010ac0298b7524ec05f98983eaa5d88acee708ae8b5eecd1ed38"

RPROVIDES:${PN} += "avif-tools \
avif-tools(aarch-64) \
libavif-tools"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libavif.so.15()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit)"

inherit rpm
