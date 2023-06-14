SUMMARY = "Qt 6 Configuration Tool"
DESCRIPTION = "This program allows users to configure Qt6 settings (theme, font, icons, \
etc.) under DE/WM without Qt integration."
LICENSE = "BSD-2-Clause"

PV = "0.8"

RPM_NAME = "qt6ct-0.8-1.2.aarch64.rpm"
RPM_HASH = "047b6a8418c26cca74250caf034396253823800a7b8353883c8d87d84da57ddb27e3d61a85346ffa8fcd7587dc51201dd67688a496aafdf2e64241e19e577fcb"

RPROVIDES:${PN} += "libqt6ct-common.so.0.8 \
libqt6ct-style.so \
libqt6ct.so \
qt6ct"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Svg6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
