SUMMARY = "VP8/VP9 codec library"
DESCRIPTION = "WebM is an open, royalty-free, media file format designed for the web. \
 \
WebM defines the file container structure, video and audio formats. \
WebM files consist of video streams compressed with the VP8 video codec \
and audio streams compressed with the Vorbis audio codec. \
The WebM file structure is based on the Matroska container."
LICENSE = "BSD-3-Clause"

PV = "1.13.0"

RPM_NAME = "libvpx8-1.13.0-1.3.aarch64.rpm"
RPM_HASH = "77358481c9e90c3c32dfe7bf66d776a09e0103f6cee0f83aa2d64ab9c240c3363f6b4ea9206dbb5f0af52b1507a4f089395e4c27de9ba1049a05955be4e4cec1"

RPROVIDES:${PN} += "libvpx.so.8 \
libvpx8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
