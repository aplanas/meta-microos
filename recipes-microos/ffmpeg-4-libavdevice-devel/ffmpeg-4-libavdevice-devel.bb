SUMMARY = "Development files for FFmpeg's device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavdevice-devel-4.4.4-1.1.aarch64.rpm"
RPM_HASH = "4b4519241f7c9ae1d679da83f4117f0843068acbeb69c713e7166a052199d16329565bc07b1e17534cfeb1e105aefd215c1482cf4cec5665ba41e695ba96eb30"

RPROVIDES:${PN} += "ffmpeg-4-libavdevice-devel ffmpeg-4-libavdevice-devel(aarch-64) ffmpeg-devel libavdevice-devel pkgconfig(libavdevice)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-4-libavcodec-devel ffmpeg-4-libavfilter-devel ffmpeg-4-libavformat-devel ffmpeg-4-libavresample-devel ffmpeg-4-libavutil-devel ffmpeg-4-libpostproc-devel ffmpeg-4-libswresample-devel ffmpeg-4-libswscale-devel libavdevice58_13 pkgconfig(libavcodec) pkgconfig(libavfilter) pkgconfig(libavformat) pkgconfig(libavresample) pkgconfig(libavutil) pkgconfig(libpostproc) pkgconfig(libswresample) pkgconfig(libswscale)"

inherit rpm
