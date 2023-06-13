SUMMARY = "Qt 6 DataVisualization QML files and plugins"
DESCRIPTION = "QML files and plugins from the Qt 6 DataVisualization module."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-datavisualization-imports-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "aa19d9c8029906ed96c157238529c48a2f9bf676ccf4f0c087b6a2624df85797748d5bb0d7ecd115d8a238656ae87e23fc28023dd6cdc869de02a4b975e7a6b2"

RPROVIDES:${PN} += "libdatavisualizationqmlplugin.so()(64bit) \
libdatavisualizationqmlplugin.so(Qt_6)(64bit) \
libdatavisualizationqmlplugin.so(Qt_6.0)(64bit) \
libdatavisualizationqmlplugin.so(Qt_6.1)(64bit) \
libdatavisualizationqmlplugin.so(Qt_6.2)(64bit) \
libdatavisualizationqmlplugin.so(Qt_6.3)(64bit) \
libdatavisualizationqmlplugin.so(Qt_6.4)(64bit) \
libdatavisualizationqmlplugin.so(Qt_6.5)(64bit) \
libdatavisualizationqmlplugin.so(Qt_6.5.1_PRIVATE_API)(64bit) \
qt6-datavisualization-imports \
qt6-datavisualization-imports(aarch-64)"

RDEPENDS:${PN} += "libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6DataVisualizationQml.so.6()(64bit) \
libQt6DataVisualizationQml.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
