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

RPM_NAME = "libvpx-devel-1.13.0-1.3.aarch64.rpm"
RPM_HASH = "62995d3e7cd574c078db0a0b4cd52a770894f6ee66e1c8120daf3072c52d278a65226485308de9fc1312d98aa9222524837548102985cc85ec75c6d6a2244e40"

RPROVIDES:${PN} += "libvpx-devel \
libvpx-devel(aarch-64) \
pkgconfig(vpx)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvpx8"

inherit rpm
