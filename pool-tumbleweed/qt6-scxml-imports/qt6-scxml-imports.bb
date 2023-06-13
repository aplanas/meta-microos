SUMMARY = "Qt 6 Scxml QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Scxml module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-scxml-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "958ea80b93023fdf7c35a081450cf4d25dd6b1ba6bda5d899baee68d59f6f07cf92986cc4689f134cb391def11a22ef30bd5550b798ede6075bcfa8c8ce5a7ad"

RPROVIDES:${PN} += "libdeclarative_scxmlplugin.so()(64bit) \
libdeclarative_scxmlplugin.so(Qt_6)(64bit) \
libdeclarative_scxmlplugin.so(Qt_6.0)(64bit) \
libdeclarative_scxmlplugin.so(Qt_6.1)(64bit) \
libdeclarative_scxmlplugin.so(Qt_6.2)(64bit) \
libdeclarative_scxmlplugin.so(Qt_6.3)(64bit) \
libdeclarative_scxmlplugin.so(Qt_6.4)(64bit) \
libdeclarative_scxmlplugin.so(Qt_6.5)(64bit) \
libdeclarative_scxmlplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
libqtqmlstatemachineplugin.so()(64bit) \
libqtqmlstatemachineplugin.so(Qt_6)(64bit) \
libqtqmlstatemachineplugin.so(Qt_6.0)(64bit) \
libqtqmlstatemachineplugin.so(Qt_6.1)(64bit) \
libqtqmlstatemachineplugin.so(Qt_6.2)(64bit) \
libqtqmlstatemachineplugin.so(Qt_6.3)(64bit) \
libqtqmlstatemachineplugin.so(Qt_6.4)(64bit) \
libqtqmlstatemachineplugin.so(Qt_6.5)(64bit) \
libqtqmlstatemachineplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-scxml-imports \
qt6-scxml-imports(aarch-64)"

RDEPENDS:${PN} += "libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6ScxmlQml.so.6()(64bit) \
libQt6ScxmlQml.so.6(Qt_6)(64bit) \
libQt6StateMachineQml.so.6()(64bit) \
libQt6StateMachineQml.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
