SUMMARY = "Library for decoding WebP graphics format"
DESCRIPTION = "WebP is an image format that does lossy compression of digital \
photographic images. WebP consists of a codec based on VP8, and a \
container based on RIFF. Webmasters, web developers and browser \
developers can use WebP to compress, archive and distribute digital \
images more efficiently."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "libwebpdecoder3-1.3.0-2.1.aarch64.rpm"
RPM_HASH = "9cfec718471dffcf4171b4c567816f0f0c773d3c5477245b1b4a88c1cda6321bbee649a1d0ed18ad4a7108285d1ca95de9d88c48818e7e5bf30cb0b88904e726"

RPROVIDES:${PN} += "libwebpdecoder.so.3 \
libwebpdecoder3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
