SUMMARY = "Qt 6 RemoteObjects QML files"
DESCRIPTION = "QML files and plugins for the Qt 6 RemoteObjects module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjects-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "720e15a23e0697ed795d74753960f379a5698ae2f3dacc32cff77dd45d8de10c19c052b29326e75585cb11091c13cc97fc0a80655915e26832a8b93ed7109b07"

RPROVIDES:${PN} += "libdeclarative_remoteobjectsplugin.so()(64bit) \
libdeclarative_remoteobjectsplugin.so(Qt_6)(64bit) \
libdeclarative_remoteobjectsplugin.so(Qt_6.0)(64bit) \
libdeclarative_remoteobjectsplugin.so(Qt_6.1)(64bit) \
libdeclarative_remoteobjectsplugin.so(Qt_6.2)(64bit) \
libdeclarative_remoteobjectsplugin.so(Qt_6.3)(64bit) \
libdeclarative_remoteobjectsplugin.so(Qt_6.4)(64bit) \
libdeclarative_remoteobjectsplugin.so(Qt_6.5)(64bit) \
libdeclarative_remoteobjectsplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-remoteobjects-imports \
qt6-remoteobjects-imports(aarch-64)"

RDEPENDS:${PN} += "libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6RemoteObjectsQml.so.6()(64bit) \
libQt6RemoteObjectsQml.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
