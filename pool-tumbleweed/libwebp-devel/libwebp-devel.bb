SUMMARY = "Development files for libwebp, a library for the WebP format"
DESCRIPTION = "WebP is an image format that does lossy compression of digital \
photographic images. WebP consists of a codec based on VP8, and a \
container based on RIFF. Webmasters, web developers and browser \
developers can use WebP to compress, archive and distribute digital \
images more efficiently."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "libwebp-devel-1.3.0-2.1.aarch64.rpm"
RPM_HASH = "078a140f897c7d2db56093f70899aebeafb35fc4cbccb94856c77b381476caf3d1d75b734aaee5f98d8d1f845b8498741a9dc47a6f141698cb8b0f0b4e92937c"

RPROVIDES:${PN} += "libwebp-devel \
pkgconfig-libsharpyuv \
pkgconfig-libwebp \
pkgconfig-libwebpdecoder \
pkgconfig-libwebpdemux \
pkgconfig-libwebpmux"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsharpyuv0 \
libwebp7 \
libwebpdecoder3 \
libwebpdemux2 \
libwebpmux3 \
pkgconfig-libsharpyuv \
pkgconfig-libwebp"

inherit rpm
