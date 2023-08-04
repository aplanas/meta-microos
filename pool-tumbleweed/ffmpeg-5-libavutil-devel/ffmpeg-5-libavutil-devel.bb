SUMMARY = "Development files for FFmpeg's utility library"
DESCRIPTION = "The libavutil library is a utility library to aid portable multimedia \
programming. It contains safe portable string functions, random \
number generators, data structures, additional mathematics functions, \
cryptography and multimedia related functionality (like enumerations \
for pixel and sample formats). \
 \
This subpackage contains the headers for FFmpeg libavutil."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libavutil-devel-5.1.3-2.2.aarch64.rpm"
RPM_HASH = "ba4137e2afc19a08f92be52d94194e6e5b0b74cab89e7ffcfb009093ef4276e45e9fe5116a5ae0fdbde420f0f600245642a0989748b48ee37c7f3f08cf916c7f"

RPROVIDES:${PN} += "ffmpeg-5-libavutil-devel \
libavutil-devel \
pkgconfig-libavutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavutil57"

inherit rpm
