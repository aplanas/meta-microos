SUMMARY = "Utilies from the VP8/VP9 codec library"
DESCRIPTION = "This package contains utilities around the vp8 codec sdk. \
 \
WebM is an open, royalty-free, media file format designed for the web. \
 \
WebM defines the file container structure, video and audio formats. \
WebM files consist of video streams compressed with the VP8 video codec \
and audio streams compressed with the Vorbis audio codec. \
The WebM file structure is based on the Matroska container."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later"

PV = "1.13.0"

RPM_NAME = "vpx-tools-1.13.0-1.4.aarch64.rpm"
RPM_HASH = "fa06ddbd958837fb1f9407e996b24c1ddbdc9800333499b29e96aac538702a360a484646fd194a2935a45804c46f9697d25c3d2d6c92f617c829e3c915f8a62b"

RPROVIDES:${PN} += "vpx-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libvpx.so.8"

inherit rpm
