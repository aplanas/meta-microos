SUMMARY = "Framework for managing menu and toolbar actions"
DESCRIPTION = "libkxmlgui provides a framework for managing menu and toolbar actions in an \
abstract way. The actions are configured through a XML description and hooks \
in the application code. The framework supports merging of multiple \
description for example for integrating actions from plugins. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.109.0"

RPM_NAME = "kxmlgui-devel-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "9eb6328183603c6d188f3ac66c89f744fe66f68b8dcb6e801cfa947cb2e4c5bd7a14f11e513f185a55306c2f2d2c12851dd91484b6d3129fbee4e1ea4bc9a374"

RPROVIDES:${PN} += "cmake-KF5XmlGui \
kxmlgui-devel"

RDEPENDS:${PN} += "cmake-KF5Config \
cmake-KF5ConfigWidgets \
cmake-Qt5DBus \
cmake-Qt5Widgets \
cmake-Qt5Xml \
extra-cmake-modules \
ld-linux-aarch64.so.1 \
libKF5XmlGui.so.5 \
libKF5XmlGui5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
