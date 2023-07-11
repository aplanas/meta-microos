SUMMARY = "VP8/VP9 codec library"
DESCRIPTION = "WebM is an open, royalty-free, media file format designed for the web. \
 \
WebM defines the file container structure, video and audio formats. \
WebM files consist of video streams compressed with the VP8 video codec \
and audio streams compressed with the Vorbis audio codec. \
The WebM file structure is based on the Matroska container."
LICENSE = "BSD-3-Clause"

PV = "1.13.0"

RPM_NAME = "libvpx8-1.13.0-1.4.aarch64.rpm"
RPM_HASH = "800269e2a5cd09265590538df9145beaef3c591b626716dce923681686815edb166951854e27e514f3e4b774369ef20c92924487f2a38d7a962393cb7dd9f4c7"

RPROVIDES:${PN} += "libvpx.so.8 \
libvpx8"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
