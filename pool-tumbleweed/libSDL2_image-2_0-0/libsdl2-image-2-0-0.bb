SUMMARY = "Simple DirectMedia Layer 2 image loading library"
DESCRIPTION = "This is a simple library to load images of various formats as SDL \
surfaces. This library supports the BMP, PPM, PCX, GIF, JPEG, PNG, \
TIFF and WEBP formats."
LICENSE = "Zlib"

PV = "2.6.3"

RPM_NAME = "libSDL2_image-2_0-0-2.6.3-1.3.aarch64.rpm"
RPM_HASH = "c505f23b1f7720547af65508d2b83209464aa873db146184fe9d62c86dcc1e02b57fd4deb2cd28adeb208b9db0573e756436156829ca88c4d11e1f8046680a35"

RPROVIDES:${PN} += "SDL2_image \
libSDL2_image-2.0.so.0()(64bit) \
libSDL2_image-2_0-0 \
libSDL2_image-2_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.10)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.16)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.18)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.5)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.6)(64bit) \
libSDL2-2.0.so.0(SUSE_2.0.9)(64bit) \
libSDL2-2.0.so.0(SUSE_2.24.0)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libjxl.so.0.8()(64bit) \
libjxl.so.0.8(JXL_0)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libwebp.so.7()(64bit)"

inherit rpm
