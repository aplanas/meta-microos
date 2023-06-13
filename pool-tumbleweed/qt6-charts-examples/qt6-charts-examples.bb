SUMMARY = "Examples for the qt6-charts modules"
DESCRIPTION = "Examples for the qt6-charts modules."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "qt6-charts-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "0929733c43df9c31c1e2eab2f75495c707a1a0a20443014daff1fb0b48f20722e2a8e1b836be5338567183655f0c3a902b6efcb3ee4275f94a01dc2027fbc243"

RPROVIDES:${PN} += "qt6-charts-examples \
qt6-charts-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Charts.so.6()(64bit) \
libQt6Charts.so.6(Qt_6)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
