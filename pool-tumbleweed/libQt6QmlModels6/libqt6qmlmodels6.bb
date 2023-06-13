SUMMARY = "Qt 6 QmlModels library"
DESCRIPTION = "The Qt 6 QmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QmlModels6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "794280a06a49112fbb7a5a668732cced09f3773fa03acb9f92c03c438b7bf2d02f7f92d94ef2edd4bac618fd9a4bbea13e41821ffb70e699971ec9dcce015994"

RPROVIDES:${PN} += "libQt6QmlModels.so.6()(64bit) \
libQt6QmlModels.so.6(Qt_6)(64bit) \
libQt6QmlModels.so.6(Qt_6.0)(64bit) \
libQt6QmlModels.so.6(Qt_6.1)(64bit) \
libQt6QmlModels.so.6(Qt_6.2)(64bit) \
libQt6QmlModels.so.6(Qt_6.3)(64bit) \
libQt6QmlModels.so.6(Qt_6.4)(64bit) \
libQt6QmlModels.so.6(Qt_6.5)(64bit) \
libQt6QmlModels.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6QmlModels6 \
libQt6QmlModels6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Qml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
