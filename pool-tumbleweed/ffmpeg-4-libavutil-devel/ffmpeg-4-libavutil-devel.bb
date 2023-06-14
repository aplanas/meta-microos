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

RPM_NAME = "ffmpeg-4-libavutil-devel-4.4.4-1.2.aarch64.rpm"
RPM_HASH = "60fb83d44b58605a06af00f56a9205e85bf2c78cb7c5d896f579524f8470d635571e00fc01c5f0eb0e7f5b30bd6c7652c938bc3135851e220cc8dd61a2efe6ff"

RPROVIDES:${PN} += "ffmpeg-4-libavutil-devel \
libavutil-devel \
pkgconfig-libavutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavutil56-70"

inherit rpm
