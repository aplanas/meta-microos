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
libwebp-tools(aarch-64) \
webp-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libc.so.6()(64bit) \
libgif.so.7()(64bit) \
libglut.so.3()(64bit) \
libjpeg.so.8()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libsharpyuv.so.0()(64bit) \
libtiff.so.6()(64bit) \
libwebp.so.7()(64bit) \
libwebpdemux.so.2()(64bit) \
libwebpmux.so.3()(64bit)"

inherit rpm
