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

RPM_NAME = "ffmpeg-5-libavutil-devel-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "82c79de59a1f636e786b8ac7e556999f10fdb40bfe709d510d126e4f34f1be1438a6f8f7766010845c9ccfac5d61d261ebbd067e59df60e0e4930a6c76936534"

RPROVIDES:${PN} += "ffmpeg-5-libavutil-devel ffmpeg-5-libavutil-devel(aarch-64) libavutil-devel pkgconfig(libavutil)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libavutil57"

inherit rpm
