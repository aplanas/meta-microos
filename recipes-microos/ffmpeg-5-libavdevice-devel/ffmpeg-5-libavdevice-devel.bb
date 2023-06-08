SUMMARY = "Development files for FFmpeg's device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libavdevice-devel-5.1.3-1.1.aarch64.rpm"
RPM_HASH = "717718489d05092e455040237b975dda14027ed998776f8d8ba4ed84741699ba641b0594073c27fe14999c79ca663984db36b7430bc87bdd3c1478a40d5c5af3"

RPROVIDES:${PN} += "ffmpeg-5-libavdevice-devel ffmpeg-5-libavdevice-devel(aarch-64) ffmpeg-devel libavdevice-devel pkgconfig(libavdevice)"
RDEPENDS:${PN} += "/usr/bin/pkg-config ffmpeg-5-libavcodec-devel ffmpeg-5-libavfilter-devel ffmpeg-5-libavformat-devel ffmpeg-5-libavutil-devel ffmpeg-5-libpostproc-devel ffmpeg-5-libswresample-devel ffmpeg-5-libswscale-devel libavdevice59 pkgconfig(libavcodec) pkgconfig(libavfilter) pkgconfig(libavformat) pkgconfig(libavutil) pkgconfig(libpostproc) pkgconfig(libswresample) pkgconfig(libswscale)"

inherit rpm
