SUMMARY = "Qt 6 QuickTimeline QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 QuickTimeline module"
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-quicktimeline-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "38720716701b582c5d5188866d6b7f3020f8ddd000fc9ccf5f5d5ab0995a28bdf3bb1099c2cd34e107d4ef533a0c24e40a07d619ad70e8f7af79fbb93255a97a"

RPROVIDES:${PN} += "libqtquicktimelineplugin.so()(64bit) \
libqtquicktimelineplugin.so(Qt_6)(64bit) \
libqtquicktimelineplugin.so(Qt_6.0)(64bit) \
libqtquicktimelineplugin.so(Qt_6.1)(64bit) \
libqtquicktimelineplugin.so(Qt_6.2)(64bit) \
libqtquicktimelineplugin.so(Qt_6.3)(64bit) \
libqtquicktimelineplugin.so(Qt_6.4)(64bit) \
libqtquicktimelineplugin.so(Qt_6.5)(64bit) \
libqtquicktimelineplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-quicktimeline-imports \
qt6-quicktimeline-imports(aarch-64)"

RDEPENDS:${PN} += "libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6QuickTimeline.so.6()(64bit) \
libQt6QuickTimeline.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
