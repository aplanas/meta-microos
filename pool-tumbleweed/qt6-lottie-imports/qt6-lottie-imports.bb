SUMMARY = "Qt 6 Lottie QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 Lottie module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-lottie-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "ef28152adf22378e3d3be4a5fa85484cc28b7f5c58269d50cb8e5c43598c76c508987919a535b8a1d3af4db818d32f757663ffbeffc860651083cb1652acdfb0"

RPROVIDES:${PN} += "liblottieqtplugin.so()(64bit) \
liblottieqtplugin.so(Qt_6)(64bit) \
liblottieqtplugin.so(Qt_6.0)(64bit) \
liblottieqtplugin.so(Qt_6.1)(64bit) \
liblottieqtplugin.so(Qt_6.2)(64bit) \
liblottieqtplugin.so(Qt_6.3)(64bit) \
liblottieqtplugin.so(Qt_6.4)(64bit) \
liblottieqtplugin.so(Qt_6.5)(64bit) \
liblottieqtplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-lottie-imports \
qt6-lottie-imports(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Bodymovin.so.6()(64bit) \
libQt6Bodymovin.so.6(Qt_6)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
