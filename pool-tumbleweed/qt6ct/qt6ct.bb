SUMMARY = "Qt 6 Configuration Tool"
DESCRIPTION = "This program allows users to configure Qt6 settings (theme, font, icons, \
etc.) under DE/WM without Qt integration."
LICENSE = "BSD-2-Clause"

PV = "0.8"

RPM_NAME = "qt6ct-0.8-1.3.aarch64.rpm"
RPM_HASH = "6c2bd4939d5d11d57ae85cea46821783bd690433dce248fe43e85bd7ab01189d6d21ca505e4fb71f31312a9d8be3e5d2ed798d514fd0d2818c12fbece62e113f"

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
