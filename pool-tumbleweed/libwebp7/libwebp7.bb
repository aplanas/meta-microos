SUMMARY = "Library for the WebP graphics format"
DESCRIPTION = "WebP is an image format that does lossy compression of digital \
photographic images. WebP consists of a codec based on VP8, and a \
container based on RIFF. Webmasters, web developers and browser \
developers can use WebP to compress, archive and distribute digital \
images more efficiently."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "libwebp7-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "61a121b88237db886109f53f9066ec1fc379189882dba7af624daec9e728fb87c158a4339df4d00931aeebea97a69e01b3c57f9fe02b4ed647781900fc8a6f41"

RPROVIDES:${PN} += "libwebp.so.7 \
libwebp7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsharpyuv.so.0"

inherit rpm
