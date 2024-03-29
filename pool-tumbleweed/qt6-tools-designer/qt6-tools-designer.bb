SUMMARY = "Qt graphical interface creation tool"
DESCRIPTION = "Qt Designer is a tool for designing and building graphical user interface \
with Qt Widgets."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "qt6-tools-designer-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "a6d6c2d8015dd904b49dee7a24827ec5ef33281d7255df3a07a699caa6ca622205e207b242ed1ece885cdb91ca5d4a893947abf3cd09158c4a4aa164332bcfa9"

RPROVIDES:${PN} += "libcontainerextension.so \
libcustomwidgetplugin.so \
libqquickwidget.so \
libtaskmenuextension.so \
qt6-tools-designer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Designer.so.6 \
libQt6DesignerComponents.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Quick.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
