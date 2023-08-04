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

RPM_NAME = "ffmpeg-4-libavutil-devel-4.4.4-2.2.aarch64.rpm"
RPM_HASH = "1559a49d5d4c89b708f5cc45f924060ea7a48f040ffe2673d8795e21cc44c49b5ec769f861d144d43c1c8138982a2b0cafa4d448f8e3dfd16c5f8f9c8cf493ba"

RPROVIDES:${PN} += "ffmpeg-4-libavutil-devel \
libavutil-devel \
pkgconfig-libavutil"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavutil56-70"

inherit rpm
