SUMMARY = "Development files for FFmpeg's device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "ffmpeg-4-libavdevice-devel-4.4.4-2.2.aarch64.rpm"
RPM_HASH = "960ba2b19924c23cf0601cf35ae35b56af94d4fa899e485dce00acae471841c57cf3dc67ba4d0a15f87069c4812ec145659a6b7cee9acbc1af8e3cad17270c2e"

RPROVIDES:${PN} += "ffmpeg-4-libavdevice-devel \
ffmpeg-devel \
libavdevice-devel \
pkgconfig-libavdevice"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ffmpeg-4-libavcodec-devel \
ffmpeg-4-libavfilter-devel \
ffmpeg-4-libavformat-devel \
ffmpeg-4-libavresample-devel \
ffmpeg-4-libavutil-devel \
ffmpeg-4-libpostproc-devel \
ffmpeg-4-libswresample-devel \
ffmpeg-4-libswscale-devel \
libavdevice58-13 \
pkgconfig-libavcodec \
pkgconfig-libavfilter \
pkgconfig-libavformat \
pkgconfig-libavresample \
pkgconfig-libavutil \
pkgconfig-libpostproc \
pkgconfig-libswresample \
pkgconfig-libswscale"

inherit rpm
