SUMMARY = "Development files for libvpx, a VP8/VP9 codec library"
DESCRIPTION = "Development headers and library \
 \
WebM is an open, royalty-free, media file format designed for the web. \
 \
WebM defines the file container structure, video and audio formats. \
WebM files consist of video streams compressed with the VP8 video codec \
and audio streams compressed with the Vorbis audio codec. \
The WebM file structure is based on the Matroska container."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "1.13.0"

RPM_NAME = "libvpx-devel-1.13.0-1.4.aarch64.rpm"
RPM_HASH = "22e722ba9eb9f5b6fd1032b9c87b76445a9928464cd1133d43b909e7351b17f7dc8024542e09179a9c48a3253f1efb63510f6d85a3289e40edebf8da686c34cb"

RPROVIDES:${PN} += "libvpx-devel \
pkgconfig-vpx"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvpx8"

inherit rpm
