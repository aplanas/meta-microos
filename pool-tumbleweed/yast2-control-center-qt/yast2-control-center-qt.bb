SUMMARY = "YaST2 - Control Center (Qt Version)"
DESCRIPTION = "This package contains the menu selection component for YaST2 using the \
Qt toolkit."
LICENSE = "GPL-2.0-only"

PV = "4.6.1"

RPM_NAME = "yast2-control-center-qt-4.6.1-1.1.aarch64.rpm"
RPM_HASH = "62bac94035e3ff6c08ee3f35286848e01b3a25f09ed30aa9a9614af3d19775de0c8a7d9c2c01207f63cccbaf06230dc566d553f01f7706ed474e3659a9d5b239"

RPROVIDES:${PN} += "yast2-control-center-/usr/lib/YaST2/bin/y2controlcenter \
yast2-control-center-binary \
yast2-control-center-qt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Svg5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libyui-qt \
xdg-utils \
yast2-control-center"

inherit rpm
