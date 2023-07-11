SUMMARY = "Framework for managing menu and toolbar actions"
DESCRIPTION = "libkxmlgui provides a framework for managing menu and toolbar actions in an \
abstract way. The actions are configured through a XML description and hooks \
in the application code. The framework supports merging of multiple \
description for example for integrating actions from plugins. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.107.0"

RPM_NAME = "kxmlgui-devel-5.107.0-1.2.aarch64.rpm"
RPM_HASH = "fd680dfa353b2b96ddc95558ec4748c1c84433c7f2991833a838a49896930b08e38766275f9a4621abbae9ea3b0fe3c716723454022b729a8577ff737eab47b0"

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
