SUMMARY = "Tools for libavif"
DESCRIPTION = "This library aims to be a friendly, portable C implementation of the AV1 Image \
File Format, as described here: \
 \
https://aomediacodec.github.io/av1-avif/ \
 \
This package holds the commandline tools for libavif."
LICENSE = "BSD-2-Clause"

PV = "0.11.1"

RPM_NAME = "avif-tools-0.11.1-2.2.aarch64.rpm"
RPM_HASH = "7a94af8e0b8239640ed3cff16288ab38bb189cd41ab364de30d0a8435aa98ca7eddf95aa19e514ee9fb8e0ed5d8d28381c25fd68df575471f47c3b5f7890801b"

RPROVIDES:${PN} += "avif-tools \
libavif-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavif.so.15 \
libc.so.6 \
libjpeg.so.8 \
libpng16.so.16"

inherit rpm
