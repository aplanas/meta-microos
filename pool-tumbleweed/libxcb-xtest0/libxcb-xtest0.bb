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

RPM_NAME = "libxcb-xtest0-1.15-2.2.aarch64.rpm"
RPM_HASH = "52fadb187150394d83f37cc3229eda15f82660bf25eb205a4f791d26add4ef3eb7027705bd44fcb98c1bf9003199942146a95ef9532891867e473c3c7ad6f7fa"

RPROVIDES:${PN} += "libxcb-xtest.so.0()(64bit) \
libxcb-xtest0 \
libxcb-xtest0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libxcb.so.1()(64bit)"

inherit rpm
