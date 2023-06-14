SUMMARY = "Deepin Toolkit GUI libraries"
DESCRIPTION = "Deepint Tool Kit (Dtk) GUI is the base devlopment tool of all C++/Qt developer \
work on Deepin."
LICENSE = "LGPL-3.0"

PV = "5.5.25"

RPM_NAME = "libdtkgui5-5.5.25-1.7.aarch64.rpm"
RPM_HASH = "d4ac4b509c2886aa203e3e86cbad567d370a21ee9ff2655a48a246a05add874cbee688edbf4bda7d9de20212da3926bce037bfafb552c49fa5d754830816bcfa"

RPROVIDES:${PN} += "libdtkgui.so.5 \
libdtkgui5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libc.so.6 \
libdtkcore.so.5 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libstdc++.so.6"

inherit rpm
