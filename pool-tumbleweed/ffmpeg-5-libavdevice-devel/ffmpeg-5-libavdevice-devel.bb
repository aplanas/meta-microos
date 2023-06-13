SUMMARY = "Development files for FFmpeg's device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libavdevice-devel-5.1.3-1.2.aarch64.rpm"
RPM_HASH = "d8d203e575ee36ecebda193a1a56d91b0e4ee3395773daca2552ddc3ae632db7d26813a41d873db8f8df86d5d505f18d4c2ac0874ac59d00ab87376662f5bd00"

RPROVIDES:${PN} += "ffmpeg-5-libavdevice-devel \
ffmpeg-5-libavdevice-devel(aarch-64) \
ffmpeg-devel \
libavdevice-devel \
pkgconfig(libavdevice)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-5-libavcodec-devel \
ffmpeg-5-libavfilter-devel \
ffmpeg-5-libavformat-devel \
ffmpeg-5-libavutil-devel \
ffmpeg-5-libpostproc-devel \
ffmpeg-5-libswresample-devel \
ffmpeg-5-libswscale-devel \
libavdevice59 \
pkgconfig(libavcodec) \
pkgconfig(libavfilter) \
pkgconfig(libavformat) \
pkgconfig(libavutil) \
pkgconfig(libpostproc) \
pkgconfig(libswresample) \
pkgconfig(libswscale)"

inherit rpm
