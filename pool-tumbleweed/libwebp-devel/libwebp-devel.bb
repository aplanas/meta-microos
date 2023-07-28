SUMMARY = "Development files for libwebp, a library for the WebP format"
DESCRIPTION = "WebP is an image format that does lossy compression of digital \
photographic images. WebP consists of a codec based on VP8, and a \
container based on RIFF. Webmasters, web developers and browser \
developers can use WebP to compress, archive and distribute digital \
images more efficiently."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "libwebp-devel-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "bd9fe9718d35ea217f814061c4587de276e639167da91f3f9a5b7b1e86fdb4b2f4a795e9cd11ceff8f1c60c52d16646ef1041d1c8550052c11259a4f757dc6f9"

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
