SUMMARY = "X11 ScreenSaver Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The X Window System provides support for changing the image on a \
display screen after a user-settable period of inactivity to avoid \
burning the cathode ray tube phosphors. This extension allows an \
external 'screen saver' client to detect when the alternate image is \
to be displayed and to provide the graphics."
LICENSE = "MIT"

PV = "1.16"

RPM_NAME = "libxcb-screensaver0-1.16-1.1.aarch64.rpm"
RPM_HASH = "14b8bba7950f2305e68a33e1c9d3a3364b6de0f7574e94fbe94cfb55624cad3d6b5806f2bb163088f6b77b0491fa4cd157a5c37d0f2366a4a3b17ebdbde95769"

RPROVIDES:${PN} += "libxcb-screensaver.so.0 \
libxcb-screensaver0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
