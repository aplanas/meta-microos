SUMMARY = "Library for the WebP graphics format"
DESCRIPTION = "WebP is an image format that does lossy compression of digital \
photographic images. WebP consists of a codec based on VP8, and a \
container based on RIFF. Webmasters, web developers and browser \
developers can use WebP to compress, archive and distribute digital \
images more efficiently."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "libwebp7-1.3.0-2.1.aarch64.rpm"
RPM_HASH = "2adee08552a32f73babbd9235929d5b7bba03fbbd64269e756f3d609e0fc20ec2f0322f89b3fbe207455a227956da2c7c760959a91257edbfd004a4e28ac6a6a"

RPROVIDES:${PN} += "libwebp.so.7 \
libwebp7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libsharpyuv.so.0"

inherit rpm
