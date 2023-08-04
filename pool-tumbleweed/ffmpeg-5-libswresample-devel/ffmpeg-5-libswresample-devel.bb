SUMMARY = "Development files for the FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats. \
 \
This subpackage contains the headers for FFmpeg libswresample."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libswresample-devel-5.1.3-2.2.aarch64.rpm"
RPM_HASH = "983f7d4295b220f86f3f8a59d1d54828ebbac5752acadc3e6dd39bb4319448d3203f503be100c2c58d2e479e73e4bc7380442ab86fb40114c15d2849e15bb393"

RPROVIDES:${PN} += "ffmpeg-5-libswresample-devel \
libswresample-devel \
pkgconfig-libswresample"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-5-libavutil-devel \
libswresample4-ff5 \
pkgconfig-libavutil"

inherit rpm
