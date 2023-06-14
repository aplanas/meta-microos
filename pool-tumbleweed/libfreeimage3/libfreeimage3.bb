SUMMARY = "Multi-format Image Decoder Library"
DESCRIPTION = "FreeImage is a library for developers who would like to support \
graphics image formats like PNG, BMP, JPEG, TIFF and others as needed \
by today's multimedia applications."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.18.0"

RPM_NAME = "libfreeimage3-3.18.0-6.3.aarch64.rpm"
RPM_HASH = "816402a059f5bf2d998f830389e79d6ee43c2125d1732560bd2f6419e5a4aec5c521d41996e9a4f7f322c3e0404a4b917f544dd758febc382442c12fd7712176"

RPROVIDES:${PN} += "libfreeimage.so.3 \
libfreeimage3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libIex-3-1.so.30 \
libImath-3-1.so.29 \
libOpenEXR-3-1.so.30 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libjxrglue.so.0 \
libopenjp2.so.7 \
libpng16.so.16 \
libraw.so.23 \
libstdc++.so.6 \
libtiff.so.6 \
libwebp.so.7 \
libwebpmux.so.3 \
libz.so.1"

inherit rpm
