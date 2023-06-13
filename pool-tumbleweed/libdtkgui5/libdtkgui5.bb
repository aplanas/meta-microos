SUMMARY = "Deepin Toolkit GUI libraries"
DESCRIPTION = "Deepint Tool Kit (Dtk) GUI is the base devlopment tool of all C++/Qt developer \
work on Deepin."
LICENSE = "LGPL-3.0"

PV = "5.5.25"

RPM_NAME = "libdtkgui5-5.5.25-1.7.aarch64.rpm"
RPM_HASH = "d4ac4b509c2886aa203e3e86cbad567d370a21ee9ff2655a48a246a05add874cbee688edbf4bda7d9de20212da3926bce037bfafb552c49fa5d754830816bcfa"

RPROVIDES:${PN} += "libdtkgui.so.5()(64bit) \
libdtkgui5 \
libdtkgui5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5DBus.so.5()(64bit) \
libQt5DBus.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libdtkcore.so.5()(64bit) \
libgcc_s.so.1()(64bit) \
libglib-2.0.so.0()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
