SUMMARY = "Tools for libavif"
DESCRIPTION = "This library aims to be a friendly, portable C implementation of the AV1 Image \
File Format, as described here: \
 \
https://aomediacodec.github.io/av1-avif/ \
 \
This package holds the commandline tools for libavif."
LICENSE = "BSD-2-Clause"

PV = "1.0.0"

RPM_NAME = "avif-tools-1.0.0-1.1.aarch64.rpm"
RPM_HASH = "f386bad761b31e0b8651ff7eb8e60398ea3abd9295f0c48b07eb68fd6a0cb12e7bf64fc2d4fb91aec5bbeff8872b4c5451464eb38f2b92cc9be43f0a31141d91"

RPROVIDES:${PN} += "avif-tools \
libavif-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavif.so.16 \
libc.so.6 \
libjpeg.so.8 \
libpng16.so.16"

inherit rpm
