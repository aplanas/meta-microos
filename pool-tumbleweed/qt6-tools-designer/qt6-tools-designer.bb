SUMMARY = "Qt graphical interface creation tool"
DESCRIPTION = "Qt Designer is a tool for designing and building graphical user interface \
with Qt Widgets."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-designer-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "6ed7f37fe54a36d03c055db0e9b0ef11070b34f9d0f35319ebcc22879a199c3a637d7dd8e01a7cface30b41c0cb8ab76dee7ac3357878f2fc8290451a5d854cc"

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
