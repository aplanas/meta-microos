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

RPM_NAME = "ffmpeg-6-libavutil-devel-6.0-3.1.aarch64.rpm"
RPM_HASH = "9a06e81addb95a95c2b39395f9314b881d593f0861ad1a336ea28a07f635f6fcf2dcf79227292a6d0f2dbbb7f4ed565f0e56c288c1488e8f314c61dfa51233fa"

RPROVIDES:${PN} += "ffmpeg-6-libavutil-devel \
libavutil-devel \
pkgconfig-libavutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavutil58"

inherit rpm
