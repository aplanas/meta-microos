SUMMARY = "Development files for FFmpeg's device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libavdevice-devel-6.0-2.4.aarch64.rpm"
RPM_HASH = "d0e466a4c3ce2168f2023ed720a308ba62f967de5de157dc4ca6a564de7a8be16eaac9821dd3f28aa071bd16a9fb89cc8888ea32aed2af8ef50374dbf6eddb8b"

RPROVIDES:${PN} += "ffmpeg-6-libavdevice-devel \
ffmpeg-devel \
libavdevice-devel \
pkgconfig-libavdevice"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-6-libavcodec-devel \
ffmpeg-6-libavfilter-devel \
ffmpeg-6-libavformat-devel \
ffmpeg-6-libavutil-devel \
ffmpeg-6-libpostproc-devel \
ffmpeg-6-libswresample-devel \
ffmpeg-6-libswscale-devel \
libavdevice60 \
pkgconfig-libavcodec \
pkgconfig-libavfilter \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libpostproc \
pkgconfig-libswresample \
pkgconfig-libswscale"

inherit rpm
