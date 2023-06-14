SUMMARY = "Simple DirectMedia Layer 2 image loading library"
DESCRIPTION = "This is a simple library to load images of various formats as SDL \
surfaces. This library supports the BMP, PPM, PCX, GIF, JPEG, PNG, \
TIFF and WEBP formats."
LICENSE = "Zlib"

PV = "2.6.3"

RPM_NAME = "libSDL2_image-2_0-0-2.6.3-1.3.aarch64.rpm"
RPM_HASH = "c505f23b1f7720547af65508d2b83209464aa873db146184fe9d62c86dcc1e02b57fd4deb2cd28adeb208b9db0573e756436156829ca88c4d11e1f8046680a35"

RPROVIDES:${PN} += "SDL2-image \
libSDL2-image-2-0-0 \
libSDL2-image-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libjpeg.so.8 \
libjxl.so.0.8 \
libpng16.so.16 \
libtiff.so.6 \
libwebp.so.7"

inherit rpm
