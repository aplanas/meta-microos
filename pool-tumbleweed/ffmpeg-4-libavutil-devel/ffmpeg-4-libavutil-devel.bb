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

RPM_NAME = "ffmpeg-4-libavutil-devel-4.4.4-2.3.aarch64.rpm"
RPM_HASH = "17c4ea1ce4d3857ca3834412d94f3104523aff30ea83fe33df5449d166ba3000c14a969f31b680db5098205f0741e6f09a60384b825bc74e66953c583712fa48"

RPROVIDES:${PN} += "ffmpeg-4-libavutil-devel \
libavutil-devel \
pkgconfig-libavutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavutil56-70"

inherit rpm
