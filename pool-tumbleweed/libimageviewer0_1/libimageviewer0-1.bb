SUMMARY = "The library of Deepin Image editor"
DESCRIPTION = "This package contains the libraries for Deepin Image editor."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.24"

RPM_NAME = "libimageviewer0_1-1.0.24-1.1.aarch64.rpm"
RPM_HASH = "eb503e982f832ba1d6675199a44e04e31dbc185fffd10438a848b338846b51aa315c8a2d28e1aebb43eb83dd86463abfa438f8d6f2f8688f91cfc4ee2e247924"

RPROVIDES:${PN} += "libimageviewer.so.0.1()(64bit) \
libimageviewer0_1 \
libimageviewer0_1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5PrintSupport.so.5()(64bit) \
libQt5PrintSupport.so.5(Qt_5)(64bit) \
libQt5Svg.so.5()(64bit) \
libQt5Svg.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libdtkcore.so.5()(64bit) \
libdtkgui.so.5()(64bit) \
libdtkwidget.so.5()(64bit) \
libfreeimage.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit)"

inherit rpm
