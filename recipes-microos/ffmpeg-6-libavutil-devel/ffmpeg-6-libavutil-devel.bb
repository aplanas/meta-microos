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

RPM_NAME = "ffmpeg-6-libavutil-devel-6.0-2.1.aarch64.rpm"
RPM_HASH = "24f550dedf3eca14b1b7171dfb97bbf8f848ace3f7b74dec02c381b965e53c8a11692e2d24daddd636ed7be38a6e192fce24e68fe93746b72ae1fc6ef34dae24"

RPROVIDES:${PN} += "ffmpeg-6-libavutil-devel ffmpeg-6-libavutil-devel(aarch-64) libavutil-devel pkgconfig(libavutil)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libavutil58"

inherit rpm
