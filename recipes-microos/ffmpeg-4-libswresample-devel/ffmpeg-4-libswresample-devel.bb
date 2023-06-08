SUMMARY = "Development files for the FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats. \
 \
This subpackage contains the headers for FFmpeg libswresample."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libswresample-devel-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "4e268fa44e6f0a1581c8eab3385001611cada2d563eb6f1659677ee1adfa521c2dd7d819a0e341d64a0ed7d98878b2c4c3a3ddff08c59a6664c40e2b0186d647"

RPROVIDES:${PN} += "ffmpeg-4-libswresample-devel ffmpeg-4-libswresample-devel(aarch-64) libswresample-devel pkgconfig(libswresample)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-4-libavutil-devel libswresample3_9 pkgconfig(libavutil)"

inherit rpm
