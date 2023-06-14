SUMMARY = "The library of Deepin Image editor"
DESCRIPTION = "This package contains the libraries for Deepin Image editor."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.24"

RPM_NAME = "libimageviewer0_1-1.0.24-1.1.aarch64.rpm"
RPM_HASH = "eb503e982f832ba1d6675199a44e04e31dbc185fffd10438a848b338846b51aa315c8a2d28e1aebb43eb83dd86463abfa438f8d6f2f8688f91cfc4ee2e247924"

RPROVIDES:${PN} += "libimageviewer.so.0.1 \
libimageviewer0-1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdtkcore.so.5 \
libdtkgui.so.5 \
libdtkwidget.so.5 \
libfreeimage.so.3 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtiff.so.6"

inherit rpm
