SUMMARY = "Simple DirectMedia Layer Library"
DESCRIPTION = "This is the 'Simple DirectMedia Layer' library. It provides a generic \
API for access to audio, keyboard, mouse, and display framebuffer \
across multiple platforms. \
 \
SDL2 uses dlopen, so if you experience problems under X11, check \
again that libXrandr2 and libXi6 are in fact installed."
LICENSE = "Zlib"

PV = "2.28.2"

RPM_NAME = "libSDL2-2_0-0-2.28.2-1.1.aarch64.rpm"
RPM_HASH = "4c79769de9c184fdfbd563914cbce4b162181c512581c51ef8d2848a8f1378d29b57ba170cf17ff1e546b4941432b4e83affce2b78c46df03f69a66eb31561a0"

RPROVIDES:${PN} += "SDL2 \
libSDL2-2-0-0 \
libSDL2-2.0.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libasound.so.2 \
libc.so.6 \
libm.so.6"

inherit rpm
