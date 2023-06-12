SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package provides core Qt 3D QML types."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DQuick5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "4658e189cfcda7e225f8fbd23af3a33368dfd7ca472a95ccbf5d4778f94a67e7ca4e1b56089b765f7355bfb9cbc5683069c16493a088e369d8f0adc53cd67647"

RPROVIDES:${PN} += "libQt53DQuick.so.5()(64bit) \
libQt53DQuick.so.5(Qt_5)(64bit) \
libQt53DQuick.so.5(Qt_5.0)(64bit) \
libQt53DQuick.so.5(Qt_5.1)(64bit) \
libQt53DQuick.so.5(Qt_5.10)(64bit) \
libQt53DQuick.so.5(Qt_5.11)(64bit) \
libQt53DQuick.so.5(Qt_5.12)(64bit) \
libQt53DQuick.so.5(Qt_5.13)(64bit) \
libQt53DQuick.so.5(Qt_5.14)(64bit) \
libQt53DQuick.so.5(Qt_5.15)(64bit) \
libQt53DQuick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt53DQuick.so.5(Qt_5.2)(64bit) \
libQt53DQuick.so.5(Qt_5.3)(64bit) \
libQt53DQuick.so.5(Qt_5.4)(64bit) \
libQt53DQuick.so.5(Qt_5.5)(64bit) \
libQt53DQuick.so.5(Qt_5.6)(64bit) \
libQt53DQuick.so.5(Qt_5.7)(64bit) \
libQt53DQuick.so.5(Qt_5.8)(64bit) \
libQt53DQuick.so.5(Qt_5.9)(64bit) \
libQt53DQuick5 \
libQt53DQuick5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt53DCore.so.5()(64bit) \
libQt53DCore.so.5(Qt_5)(64bit) \
libQt53DCore.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Core.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Core5 \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Qml.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5QmlModels.so.5()(64bit) \
libQt5QmlModels.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
