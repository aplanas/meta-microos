SUMMARY = "Simple DirectMedia Layer Library"
DESCRIPTION = "This is the 'Simple DirectMedia Layer' library. It provides a generic \
API for access to audio, keyboard, mouse, and display framebuffer \
across multiple platforms. \
 \
SDL2 uses dlopen, so if you experience problems under X11, check \
again that libXrandr2 and libXi6 are in fact installed."
LICENSE = "Zlib"

PV = "2.26.5"

RPM_NAME = "libSDL2-2_0-0-2.26.5-1.1.aarch64.rpm"
RPM_HASH = "ffe9bf5f3558c9f30d11623f758098620fb946e1dcb4d07b7b2727375f3e206c7162ccf551a8c5fcb10341ae34af6c1f28850a8cdc61bfd2387158a4261c1d52"

RPROVIDES:${PN} += "SDL2 \
libSDL2-2.0.so.0()(64bit) \
libSDL2-2_0-0 \
libSDL2-2_0-0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit)"

inherit rpm
