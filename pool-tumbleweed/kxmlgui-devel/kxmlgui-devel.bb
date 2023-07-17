SUMMARY = "Framework for managing menu and toolbar actions"
DESCRIPTION = "libkxmlgui provides a framework for managing menu and toolbar actions in an \
abstract way. The actions are configured through a XML description and hooks \
in the application code. The framework supports merging of multiple \
description for example for integrating actions from plugins. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.108.0"

RPM_NAME = "kxmlgui-devel-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "be3243319f69b611478feacb9138e03fbc390363078568a2d5ffcdd9d4d70e410ff91654ba48ae2babacfc733ad5c3d12cbdcb5f6388a902c0b45f1780958b70"

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
