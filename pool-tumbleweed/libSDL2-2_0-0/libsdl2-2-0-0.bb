SUMMARY = "Simple DirectMedia Layer Library"
DESCRIPTION = "This is the 'Simple DirectMedia Layer' library. It provides a generic \
API for access to audio, keyboard, mouse, and display framebuffer \
across multiple platforms. \
 \
SDL2 uses dlopen, so if you experience problems under X11, check \
again that libXrandr2 and libXi6 are in fact installed."
LICENSE = "Zlib"

PV = "2.28.3"

RPM_NAME = "libSDL2-2_0-0-2.28.3-1.1.aarch64.rpm"
RPM_HASH = "b5b8d2b318f124811d33af64fbd5963cf312c7180e93e73005b65a76d89d5fc3eeac67bb38edcf9ff55222eedb99bea677979c827502d9734731ccb7b30475e2"

RPROVIDES:${PN} += "SDL2 \
libSDL2-2-0-0 \
libSDL2-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6"

inherit rpm
