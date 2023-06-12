SUMMARY = "Development files for libwebp, a library for the WebP format"
DESCRIPTION = "WebP is an image format that does lossy compression of digital \
photographic images. WebP consists of a codec based on VP8, and a \
container based on RIFF. Webmasters, web developers and browser \
developers can use WebP to compress, archive and distribute digital \
images more efficiently."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "libwebp-devel-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "bc5390758e8ac11eab5f84b2904dc66b0c28cf4b062ce8ee98fc949e2b0d03ddbe28847973dfe2b298b7b7cb2c0d938c470d288f488513dc578b63331fa0b779"

RPROVIDES:${PN} += "libwebp-devel \
libwebp-devel(aarch-64) \
pkgconfig(libsharpyuv) \
pkgconfig(libwebp) \
pkgconfig(libwebpdecoder) \
pkgconfig(libwebpdemux) \
pkgconfig(libwebpmux)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsharpyuv0 \
libwebp7 \
libwebpdecoder3 \
libwebpdemux2 \
libwebpmux3 \
pkgconfig(libsharpyuv) \
pkgconfig(libwebp)"

inherit rpm
