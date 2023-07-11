SUMMARY = "Development files for FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats). \
 \
This subpackage contains the headers for FFmpeg libavutil."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavutil-devel-4.4.4-2.1.aarch64.rpm"
RPM_HASH = "be43a0035df1b523204fcd3b0ebf8e53b0012b31c60ee25aed7b157e7fec09272088a7aee31725541eb0aee3235367dc33a281c3cd94720f6a75685dfc3961e2"

RPROVIDES:${PN} += "ffmpeg-4-libavutil-devel \
libavutil-devel \
pkgconfig-libavutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavutil56-70"

inherit rpm
