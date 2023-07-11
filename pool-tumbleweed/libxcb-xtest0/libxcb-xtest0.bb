SUMMARY = "X11 XTEST Extension C library"
DESCRIPTION = "The X protocol C-language Binding (XCB) is a replacement for Xlib \
featuring a small footprint, latency hiding, direct access to the \
protocol, improved threading support, and extensibility. \
 \
The XTEST extension is a minimal set of client and server extensions \
required to completely test the X11 server with no user intervention. \
This extension is not intended to support general journaling and \
playback of user actions."
LICENSE = "MIT"

PV = "1.15"

RPM_NAME = "libxcb-xtest0-1.15-2.3.aarch64.rpm"
RPM_HASH = "27c114fc04fae5f0f3e151d1edcb52ecae90bd607508513211639144012ca622e8c2bfd5c7e7cc3c531bd25e0162cf1c7bfba0635cb1507aebfc31578b1ce09b"

RPROVIDES:${PN} += "libxcb-xtest.so.0 \
libxcb-xtest0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
