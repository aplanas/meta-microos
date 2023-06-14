SUMMARY = "The WebP command line tools"
DESCRIPTION = "WebP is an image format that does lossy compression of digital \
photographic images. WebP consists of a codec based on VP8, and a \
container based on RIFF. Webmasters, web developers and browser \
developers can use WebP to compress, archive and distribute digital \
images more efficiently."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "libwebp-tools-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "fc8e6c2419d19b6299cad5728ecb6cfd7411e718d582916c044948a1e05f106286d391f743c51e02dd00070c5072e9c924b34b4e61f6832b993415e1b757410e"

RPROVIDES:${PN} += "libwebp-tools \
webp-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libGL.so.1 \
libc.so.6 \
libgif.so.7 \
libglut.so.3 \
libjpeg.so.8 \
libpng16.so.16 \
libsharpyuv.so.0 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3"

inherit rpm
