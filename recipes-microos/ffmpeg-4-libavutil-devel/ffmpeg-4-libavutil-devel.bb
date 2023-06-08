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

RPM_NAME = "ffmpeg-4-libavutil-devel-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "b0f9f043f5d99759d01912290ca247a23ecafc691ba63d9dd475756029edb12d4e15223f6776c85a88386a00d7b628f063bd9fa44b76cf674e083dbf93a74e55"

RPROVIDES:${PN} += "ffmpeg-4-libavutil-devel ffmpeg-4-libavutil-devel(aarch-64) libavutil-devel pkgconfig(libavutil)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libavutil56_70"

inherit rpm
