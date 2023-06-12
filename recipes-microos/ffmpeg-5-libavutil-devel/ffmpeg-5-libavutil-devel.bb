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

RPM_NAME = "ffmpeg-5-libavutil-devel-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "baf5ead4d21529be47db6cbb9aa0f5c7379dda5f0227c3e305867ade8a2ca89331246ab3e30fb6523ff95ce3a2f4c0fc6d238692db3eec4def5df25f573e7fda"

RPROVIDES:${PN} += "ffmpeg-5-libavutil-devel ffmpeg-5-libavutil-devel(aarch-64) libavutil-devel pkgconfig(libavutil)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libavutil57"

inherit rpm
