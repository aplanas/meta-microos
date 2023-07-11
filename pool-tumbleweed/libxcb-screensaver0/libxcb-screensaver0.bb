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

PV = "1.15"

RPM_NAME = "libxcb-screensaver0-1.15-2.3.aarch64.rpm"
RPM_HASH = "34989dbcd96e65fee62f0abaa2b8ff1423d83513ca9703c15ec6141ad6f84b393eaee1f4598db4609760cb34091e62f3a71ff7854a129a81033831af6e41e54b"

RPROVIDES:${PN} += "libxcb-screensaver.so.0 \
libxcb-screensaver0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
