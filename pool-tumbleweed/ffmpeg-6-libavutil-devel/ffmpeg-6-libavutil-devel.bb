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

RPM_NAME = "ffmpeg-6-libavutil-devel-6.0-2.2.aarch64.rpm"
RPM_HASH = "82709d4c9132ae87c9c4438cc569703e48de2af4f73a9465b33b306a0619b0bd2a986840ad735f7c4813ce74c4f3bf005f43e70012859799a22d51fc67d49342"

RPROVIDES:${PN} += "ffmpeg-6-libavutil-devel \
libavutil-devel \
pkgconfig-libavutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavutil58"

inherit rpm
