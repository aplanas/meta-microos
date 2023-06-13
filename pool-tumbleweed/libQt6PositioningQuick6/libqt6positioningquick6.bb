SUMMARY = "Qt 6 PositioningQuick library"
DESCRIPTION = "The Qt 6 PositioningQuick library."
LICENSE = "GPL-3.0-or-later"

PV = "6.5.1"

RPM_NAME = "libQt6PositioningQuick6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "674c9982d2b27fa646b93a408f8f8f6e4e461d971d5dee08fc0acf618ac5193c3393325e89cba2961c7419a2527146872d9fd53943b606a312a7129bc62f4e6a"

RPROVIDES:${PN} += "libQt6PositioningQuick.so.6()(64bit) \
libQt6PositioningQuick.so.6(Qt_6)(64bit) \
libQt6PositioningQuick.so.6(Qt_6.0)(64bit) \
libQt6PositioningQuick.so.6(Qt_6.1)(64bit) \
libQt6PositioningQuick.so.6(Qt_6.2)(64bit) \
libQt6PositioningQuick.so.6(Qt_6.3)(64bit) \
libQt6PositioningQuick.so.6(Qt_6.4)(64bit) \
libQt6PositioningQuick.so.6(Qt_6.5)(64bit) \
libQt6PositioningQuick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6PositioningQuick6 \
libQt6PositioningQuick6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Positioning.so.6()(64bit) \
libQt6Positioning.so.6(Qt_6)(64bit) \
libQt6Positioning.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Qml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
