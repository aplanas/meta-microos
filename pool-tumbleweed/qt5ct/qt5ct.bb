SUMMARY = "Qt5 Configuration Tool"
DESCRIPTION = "This applications allows users to configure Qt5 settings (theme, \
font, icons, etc.) under DE/WM without Qt integration."
LICENSE = "BSD-2-Clause"

PV = "1.5"

RPM_NAME = "qt5ct-1.5-1.17.aarch64.rpm"
RPM_HASH = "ab43d258cd244232a16a30676af8bcb900a863e1925fc276d0437bfce0efa1fa79d73cf0b9592c73003bbe4d2e62fc47707fd3d2b57b2a8cd27e939244a340b2"

RPROVIDES:${PN} += "config-qt5ct \
libqt5-qtct \
libqt5ct-style.so \
libqt5ct.so \
qt5ct"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Gui5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
