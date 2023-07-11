SUMMARY = "Development files for FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats). \
 \
This subpackage contains the headers for FFmpeg libavutil."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libavutil-devel-6.0-2.4.aarch64.rpm"
RPM_HASH = "e68676b59322e86957e864df39c16f04ca279135bed4eb31c1d70ecfd9bc8f32fb932a3dcb995fcb1a1d022fbf3291da2eeae247e96bc1fc101e60d518775d08"

RPROVIDES:${PN} += "ffmpeg-6-libavutil-devel \
libavutil-devel \
pkgconfig-libavutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavutil58"

inherit rpm
