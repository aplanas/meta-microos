SUMMARY = "Deepin Toolkit GUI libraries"
DESCRIPTION = "Deepint Tool Kit (Dtk) GUI is the base devlopment tool of all C++/Qt developer \
work on Deepin."
LICENSE = "LGPL-3.0"

PV = "5.5.25"

RPM_NAME = "libdtkgui5-5.5.25-1.9.aarch64.rpm"
RPM_HASH = "e756df3de6593c200c6ec843e8f23c66292d101296ef580cbd48f0f614a66ebac905ca4a1e6b046e85d6f4679a8023fbbd446ad5ff3c0e160305410ee99359a9"

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
