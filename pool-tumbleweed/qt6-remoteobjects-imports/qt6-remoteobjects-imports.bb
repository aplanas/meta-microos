SUMMARY = "Qt 6 RemoteObjects QML files"
DESCRIPTION = "QML files and plugins for the Qt 6 RemoteObjects module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "qt6-remoteobjects-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "720e15a23e0697ed795d74753960f379a5698ae2f3dacc32cff77dd45d8de10c19c052b29326e75585cb11091c13cc97fc0a80655915e26832a8b93ed7109b07"

RPROVIDES:${PN} += "libdeclarative-remoteobjectsplugin.so \
qt6-remoteobjects-imports"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6RemoteObjectsQml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
