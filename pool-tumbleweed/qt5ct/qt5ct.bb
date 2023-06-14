SUMMARY = "Qt5 Configuration Tool"
DESCRIPTION = "This applications allows users to configure Qt5 settings (theme, \
font, icons, etc.) under DE/WM without Qt integration."
LICENSE = "BSD-2-Clause"

PV = "1.5"

RPM_NAME = "qt5ct-1.5-1.16.aarch64.rpm"
RPM_HASH = "2e3b85773bd31165aa64ad9bb868d7bf1d02145440371f47b291938dbefd8036ba390fd1644951393687d3dafd04defecbe469a119660041457e4d15840bfcae"

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
