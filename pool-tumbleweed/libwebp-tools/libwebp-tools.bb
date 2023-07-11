SUMMARY = "The WebP command line tools"
DESCRIPTION = "WebP is an image format that does lossy compression of digital \
photographic images. WebP consists of a codec based on VP8, and a \
container based on RIFF. Webmasters, web developers and browser \
developers can use WebP to compress, archive and distribute digital \
images more efficiently."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "libwebp-tools-1.3.0-2.1.aarch64.rpm"
RPM_HASH = "9ed94f976bb19adbb12877540b5fce494c9226b0ab3115b68808b3f3b7afd09205d0586565a0e4bcc34459cecf60b197edb4a748c1b1c1f8021efb4f86e381e5"

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
