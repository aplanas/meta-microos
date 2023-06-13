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

RPM_NAME = "vpx-tools-1.13.0-1.3.aarch64.rpm"
RPM_HASH = "f92dfee437662c6682f0a7bd5014add4af5e75065338a166a270099bebe76e4a2753dc3ce6aa21783023f53e8ea100288177d9637e2e1e1aaddc785b2b44aec7"

RPROVIDES:${PN} += "vpx-tools \
vpx-tools(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libvpx.so.8()(64bit)"

inherit rpm
