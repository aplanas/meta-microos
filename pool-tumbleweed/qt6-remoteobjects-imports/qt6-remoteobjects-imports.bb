SUMMARY = "Qt 6 RemoteObjects QML files"
DESCRIPTION = "QML files and plugins for the Qt 6 RemoteObjects module"
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.2"

RPM_NAME = "qt6-remoteobjects-imports-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "204e664ce3878c5c725730c54b88993b70567dbf0cfc5e28dc0fe2e6ed387ad77ebbd1449677ff4152d637664c09e281cec6635d98c4c61c627d41024928f0b3"

RPROVIDES:${PN} += "libdeclarative-remoteobjectsplugin.so \
qt6-remoteobjects-imports \
qt6qmlimport-QtRemoteObjects.5 \
qt6qmlimport-QtRemoteObjects.6"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6RemoteObjectsQml.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
