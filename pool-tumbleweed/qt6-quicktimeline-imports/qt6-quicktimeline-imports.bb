SUMMARY = "Qt 6 QuickTimeline QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 QuickTimeline module"
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quicktimeline-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "38720716701b582c5d5188866d6b7f3020f8ddd000fc9ccf5f5d5ab0995a28bdf3bb1099c2cd34e107d4ef533a0c24e40a07d619ad70e8f7af79fbb93255a97a"

RPROVIDES:${PN} += "libqtquicktimelineplugin.so \
qt6-quicktimeline-imports"

RDEPENDS:${PN} += "libQt6Core.so.6 \
libQt6Qml.so.6 \
libQt6QuickTimeline.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
