SUMMARY = "Xlib-based client API for the XTEST and RECORD extensions"
DESCRIPTION = "The XTEST extension is a minimal set of client and server extensions \
required to completely test the X11 server with no user intervention. \
This extension is not intended to support general journaling and \
playback of user actions. \
 \
The RECORD extension supports the recording and reporting of all core \
X protocol and arbitrary X extension protocol."
LICENSE = "MIT"

PV = "1.2.4"

RPM_NAME = "libXtst6-1.2.4-1.2.aarch64.rpm"
RPM_HASH = "a14abfd9f7bea3881695c9f8cfd6af3d487914d11a89f270de3027c44ceeb36553bea539dd2790337036e47bb3ca2dac81fb1f49d5366d1293f8b15020f7773e"

RPROVIDES:${PN} += "libXtst \
libXtst.so.6()(64bit) \
libXtst6 \
libXtst6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
