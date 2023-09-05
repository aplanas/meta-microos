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

PV = "1.16"

RPM_NAME = "libxcb-xtest0-1.16-1.1.aarch64.rpm"
RPM_HASH = "33b0f8824052e0fea0a585bb5f9a933269cb29dcdd840113c721d86bf0ce311138639bec7746a7542075f06b92beb4144f9d12b1d0e1170883e3009311879c1a"

RPROVIDES:${PN} += "libxcb-xtest.so.0 \
libxcb-xtest0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libxcb.so.1"

inherit rpm
