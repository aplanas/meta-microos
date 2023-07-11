SUMMARY = "Simple DirectMedia Layer Library"
DESCRIPTION = "This is the 'Simple DirectMedia Layer' library. It provides a generic \
API for access to audio, keyboard, mouse, and display framebuffer \
across multiple platforms. \
 \
SDL2 uses dlopen, so if you experience problems under X11, check \
again that libXrandr2 and libXi6 are in fact installed."
LICENSE = "Zlib"

PV = "2.28.1"

RPM_NAME = "libSDL2-2_0-0-2.28.1-1.1.aarch64.rpm"
RPM_HASH = "4bd8a7199064391c0943ebd147994640fc7d793e747fa2ef2e54a16e8e690e03839d894fc1da89ee38919edcce90df10d588dd0ab4c1c69e51b2dc1ec9d507b6"

RPROVIDES:${PN} += "SDL2 \
libSDL2-2-0-0 \
libSDL2-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6"

inherit rpm
