SUMMARY = "Development files for FFmpeg's device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "6.0"

RPM_NAME = "ffmpeg-6-libavdevice-devel-6.0-2.2.aarch64.rpm"
RPM_HASH = "0eaebbe80758c11eecf89bfc04ce85473582a1059a4a85add78c0085bd382f44c81d25c7b7383d9d48182212f091d634f2a3316e36680adad600acdcdb3a622e"

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
