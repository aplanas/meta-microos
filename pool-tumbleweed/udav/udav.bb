SUMMARY = "Data handling and plotting tool"
DESCRIPTION = "UDAV is a program for data array visualization using the MathGL \
library. It support a wide spectrum of graphics, a simple script \
language and visual data handling and editing. It has a window \
interface for data viewing, changing and plotting. It can also \
execute MGL scripts, set up, rotate graphics, and so on."
LICENSE = "GPL-3.0-only"

PV = "8.0.1"

RPM_NAME = "udav-8.0.1-3.3.aarch64.rpm"
RPM_HASH = "95a771663d7845aa7aca86f8c32957c86a5278f10cef807f81810d93e9b75e0e1fe419c0ebc03086705b5ece1dc28e0e1fe204f897eca8b90b14fa85243b1bea"

RPROVIDES:${PN} += "application() \
application(mgllab.desktop) \
application(udav.desktop) \
mimehandler(text/mgl) \
udav \
udav(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libfltk.so.1.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgomp.so.1()(64bit) \
libhdf5.so.200()(64bit) \
libm.so.6()(64bit) \
libmgl-fltk.so.8()(64bit) \
libmgl-qt5.so.8()(64bit) \
libmgl.so.8()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
