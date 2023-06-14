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
libavif-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavif.so.15 \
libc.so.6 \
libjpeg.so.8 \
libpng16.so.16"

inherit rpm
