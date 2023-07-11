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

RPM_NAME = "ffmpeg-5-libavutil-devel-5.1.3-2.1.aarch64.rpm"
RPM_HASH = "eb55f0709fccf6fd8779e4d50e9acfa72ac752703f1c211f1e8d44d4205b1be37a756ab1a06a7ec119b267f0140e11c666630cda2dc073dc0b00659d7438199e"

RPROVIDES:${PN} += "ffmpeg-5-libavutil-devel \
libavutil-devel \
pkgconfig-libavutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavutil57"

inherit rpm
