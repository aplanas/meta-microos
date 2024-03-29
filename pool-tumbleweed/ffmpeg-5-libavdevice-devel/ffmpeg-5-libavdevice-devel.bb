SUMMARY = "Development files for FFmpeg's device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libavdevice-devel-5.1.3-2.2.aarch64.rpm"
RPM_HASH = "7586a520c5e6ec73020d5f0e37cfe0b98676ae8ed71cca039730f28c60fd098162b14a78f4ab60f79649b1ab65f33388ce741d7882ca9d1d1bce7d9783cd1712"

RPROVIDES:${PN} += "ffmpeg-5-libavdevice-devel \
ffmpeg-devel \
libavdevice-devel \
pkgconfig-libavdevice"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-5-libavcodec-devel \
ffmpeg-5-libavfilter-devel \
ffmpeg-5-libavformat-devel \
ffmpeg-5-libavutil-devel \
ffmpeg-5-libpostproc-devel \
ffmpeg-5-libswresample-devel \
ffmpeg-5-libswscale-devel \
libavdevice59 \
pkgconfig-libavcodec \
pkgconfig-libavfilter \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libpostproc \
pkgconfig-libswresample \
pkgconfig-libswscale"

inherit rpm
