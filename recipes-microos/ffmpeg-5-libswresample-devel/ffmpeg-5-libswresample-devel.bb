SUMMARY = "Development files for the FFmpeg software resampling library"
DESCRIPTION = "The libswresample library performs audio conversion between different \
sample rates, channel layout and channel formats. \
 \
This subpackage contains the headers for FFmpeg libswresample."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libswresample-devel-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "b2b694224b2987a9cf4563afdcd560d88accafbd58977ed8f43bac222fff4c250f9394ceabc329d3cb279abedc1a152b154f4f242289bd9c5dc8d4802364aa64"

RPROVIDES:${PN} += "ffmpeg-5-libswresample-devel ffmpeg-5-libswresample-devel(aarch-64) libswresample-devel pkgconfig(libswresample)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-5-libavutil-devel libswresample4_ff5 pkgconfig(libavutil)"

inherit rpm
