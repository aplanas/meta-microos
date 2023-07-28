SUMMARY = "The WebP command line tools"
DESCRIPTION = "WebP is an image format that does lossy compression of digital \
photographic images. WebP consists of a codec based on VP8, and a \
container based on RIFF. Webmasters, web developers and browser \
developers can use WebP to compress, archive and distribute digital \
images more efficiently."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "libwebp-tools-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "a3b46f7276e884396ebe45a601598061f95b34cad1cae7e910f4573b75c01b3dd591ce5f5f39fc99a4e0ad4d6684b581bcfdafdf1716840dafc088fa3260fd99"

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
