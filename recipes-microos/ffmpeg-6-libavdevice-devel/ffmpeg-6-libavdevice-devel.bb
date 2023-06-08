SUMMARY = "Development files for FFmpeg's device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libavdevice-devel-6.0-2.1.aarch64.rpm"
RPM_HASH = "e5b10e9c558c5c604ea836ef00e10b9b08a08a097a013fabb268441f0bd408c8da1022e2e967be1388ac8eaf37c5532861af262648740bfa847968edc8a2bee7"

RPROVIDES:${PN} += "ffmpeg-6-libavdevice-devel ffmpeg-6-libavdevice-devel(aarch-64) ffmpeg-devel libavdevice-devel pkgconfig(libavdevice)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-6-libavcodec-devel ffmpeg-6-libavfilter-devel ffmpeg-6-libavformat-devel ffmpeg-6-libavutil-devel ffmpeg-6-libpostproc-devel ffmpeg-6-libswresample-devel ffmpeg-6-libswscale-devel libavdevice60 pkgconfig(libavcodec) pkgconfig(libavfilter) pkgconfig(libavformat) pkgconfig(libavutil) pkgconfig(libpostproc) pkgconfig(libswresample) pkgconfig(libswscale)"

inherit rpm
