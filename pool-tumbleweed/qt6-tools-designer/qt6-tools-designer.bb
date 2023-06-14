SUMMARY = "Qt graphical interface creation tool"
DESCRIPTION = "Qt Designer is a tool for designing and building graphical user interface \
with Qt Widgets."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-designer-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "9c7d88cc2003e524c3ee7db27b4aac6cf4cda9f99be1ed7af945f705d2cb020161c8e4d96b246717814e2151d17c6ae505d118a2fd37570b3527b036ead25ae6"

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
