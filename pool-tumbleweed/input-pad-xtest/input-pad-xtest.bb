SUMMARY = "Input Pad with XTEST extension"
DESCRIPTION = "The input-pad-xtest package contains XTEST extension module"
LICENSE = "LGPL-2.0-or-later"

PV = "1.0.99.20140916"

RPM_NAME = "input-pad-xtest-1.0.99.20140916-5.9.aarch64.rpm"
RPM_HASH = "38d6163cab3d2d23d2ddab72c80e50c516809c789142c09f6e045e4027ab9b625fedfae4377bd0b060ebc4aa931d53751a7d3f1e30b8623e072c6338a7163f2c"

RPROVIDES:${PN} += "input-pad-xtest \
input-pad-xtest(aarch-64) \
libinput-pad-xtest-gdk.so()(64bit)"

RDEPENDS:${PN} += "input-pad \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libinput-pad-1.0.so.1()(64bit)"

inherit rpm
