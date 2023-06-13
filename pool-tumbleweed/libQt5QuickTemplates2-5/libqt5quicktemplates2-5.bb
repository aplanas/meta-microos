SUMMARY = "Qt5 QuickTemplates2 Library"
DESCRIPTION = "You need this package if you want to compile programs with qtquickcontrols2."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde5"

RPM_NAME = "libQt5QuickTemplates2-5-5.15.9+kde5-1.1.aarch64.rpm"
RPM_HASH = "9f87af6140c23a83285bce1f3597d41b684d8f9b714ed4a50f0b73a0e632f07fdd5d5910667a1bf27da3d5352ad1115a2c87ac6938c8cea94cb8b70a2abfa7a8"

RPROVIDES:${PN} += "libQt5QuickTemplates2-5 \
libQt5QuickTemplates2-5(aarch-64) \
libQt5QuickTemplates2.so.5()(64bit) \
libQt5QuickTemplates2.so.5(Qt_5)(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5QmlModels.so.5()(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
