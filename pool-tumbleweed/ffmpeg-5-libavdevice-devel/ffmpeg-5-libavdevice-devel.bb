SUMMARY = "Development files for FFmpeg's device library"
DESCRIPTION = "The libavdevice library provides a generic framework for grabbing from \
and rendering to many common multimedia input/output devices, and \
supports several input and output devices, including Video4Linux2, VfW, \
DShow, and ALSA. \
 \
This subpackage contains the headers for FFmpeg libavcodec."
LICENSE = "GPL-3.0-or-later"

PV = "5.1.3"

RPM_NAME = "ffmpeg-5-libavdevice-devel-5.1.3-2.1.aarch64.rpm"
RPM_HASH = "2db1614e4f19ac33104d6e3a45006dc682836f31ba5a8d4115399b01184a96f3ff0215e09d4f03b63e8625b8f537b43b2843a57cfce16269a4074fd230cd0a05"

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
