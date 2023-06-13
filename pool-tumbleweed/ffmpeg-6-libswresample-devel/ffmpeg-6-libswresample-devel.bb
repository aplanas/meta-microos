SUMMARY = "Development files for the FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats. \
 \
This subpackage contains the headers for FFmpeg libswresample."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libswresample-devel-6.0-2.2.aarch64.rpm"
RPM_HASH = "3b98a469905d827b58f47dd7264c68a595e4b9688100b83992a79d6076f85645cc7235cf05c7c1241ce0dd82bc7a289483b7e083c609adb4d9c5322300a14f2a"

RPROVIDES:${PN} += "ffmpeg-6-libswresample-devel \
ffmpeg-6-libswresample-devel(aarch-64) \
libswresample-devel \
pkgconfig(libswresample)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-6-libavutil-devel \
libswresample4 \
pkgconfig(libavutil)"

inherit rpm
