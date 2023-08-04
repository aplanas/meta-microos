SUMMARY = "Development files for FFmpeg's device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libavdevice-devel-6.0-3.1.aarch64.rpm"
RPM_HASH = "1ab884998f3eb0e7f2d0bd06ddfa30557d437b47ea3c376f78430b1f25027ce5d3fa09dcb3d232590a4cbabf1856b3131ffd0ee31689320289423de393897e44"

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
