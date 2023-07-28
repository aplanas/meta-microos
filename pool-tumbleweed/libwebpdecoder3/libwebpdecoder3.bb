SUMMARY = "Library for decoding WebP graphics format"
DESCRIPTION = "WebP is an image format that does lossy compression of digital \
photographic images. WebP consists of a codec based on VP8, and a \
container based on RIFF. Webmasters, web developers and browser \
developers can use WebP to compress, archive and distribute digital \
images more efficiently."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "libwebpdecoder3-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "1625f7b3abfd33b8dd9f90fc1bb6dd26663d08a4fe24cf3e08239a3af7730f824bf7ba14d8b82f4a8fba26a5529856bd28c210dd85d49666287d0eaaf1a5f121"

RPROVIDES:${PN} += "libwebpdecoder.so.3 \
libwebpdecoder3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
