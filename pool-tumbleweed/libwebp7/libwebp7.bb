SUMMARY = "Library for the WebP graphics format"
DESCRIPTION = "WebP is an image format that does lossy compression of digital \
photographic images. WebP consists of a codec based on VP8, and a \
container based on RIFF. Webmasters, web developers and browser \
developers can use WebP to compress, archive and distribute digital \
images more efficiently."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "libwebp7-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "e5a4477161489eb47c0afaa0cdec3017fe7c13473c01d652775a1c02aeac0b4ef59d4425e218115b0d151d50255c20099aa818358a61d90bcbd30b14a008ba69"

RPROVIDES:${PN} += "libwebp.so.7()(64bit) \
libwebp7 \
libwebp7(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libsharpyuv.so.0()(64bit)"

inherit rpm
