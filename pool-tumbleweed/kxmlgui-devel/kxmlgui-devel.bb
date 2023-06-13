SUMMARY = "Framework for managing menu and toolbar actions"
DESCRIPTION = "libkxmlgui provides a framework for managing menu and toolbar actions in an \
abstract way. The actions are configured through a XML description and hooks \
in the application code. The framework supports merging of multiple \
description for example for integrating actions from plugins. Development files."
LICENSE = "LGPL-2.1-or-later & GPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "kxmlgui-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "26f14d291a2ee01484a26eeed3aa27d680a13a468e43fd74a21d285174a6f1838bbc93339642c907b58fb63b5524bc2b84146dcf2c608a86431a68b951611bf8"

RPROVIDES:${PN} += "cmake(KF5XmlGui) \
kxmlgui-devel \
kxmlgui-devel(aarch-64)"

RDEPENDS:${PN} += "cmake(KF5Config) \
cmake(KF5ConfigWidgets) \
cmake(Qt5DBus) \
cmake(Qt5Widgets) \
cmake(Qt5Xml) \
extra-cmake-modules \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5XmlGui.so.5()(64bit) \
libKF5XmlGui5 \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
