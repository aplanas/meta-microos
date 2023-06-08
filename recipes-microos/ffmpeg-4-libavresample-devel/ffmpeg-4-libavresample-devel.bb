SUMMARY = "Development files for libavresample as present in FFmpeg"
DESCRIPTION = "An audio resampling library that is being provided for drop-in \
compatibility with libav. \
 \
It is advised to use libswresample for new code. \
 \
This subpackage contains the headers for FFmpeg's copy of libavresample."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavresample-devel-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "d5360b681be1f8c0fcf1eae95089daaf35cc9fdbb2a171f2fbf7779eac33bc66132b5be923d2eae589cf09d84383c117c141e53abc628e74cfe6a43246e2a585"

RPROVIDES:${PN} += "ffmpeg-4-libavresample-devel ffmpeg-4-libavresample-devel(aarch-64) libavresample-devel pkgconfig(libavresample)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-4-libavutil-devel libavresample4_0 pkgconfig(libavutil)"

inherit rpm
