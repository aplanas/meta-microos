SUMMARY = "Qt 6 LabsQmlModels library"
DESCRIPTION = "The Qt 6 LabsQmlModels library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6LabsQmlModels6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "a3864b713e095ccae81b69829609ae2885b8dd46261c9afc8600918571c77efb2ebc629a28a9712e488089e7357d35aed0c5f488077fb158722c161c5d6dc2dc"

RPROVIDES:${PN} += "libQt6LabsQmlModels.so.6()(64bit) \
libQt6LabsQmlModels.so.6(Qt_6)(64bit) \
libQt6LabsQmlModels.so.6(Qt_6.0)(64bit) \
libQt6LabsQmlModels.so.6(Qt_6.1)(64bit) \
libQt6LabsQmlModels.so.6(Qt_6.2)(64bit) \
libQt6LabsQmlModels.so.6(Qt_6.3)(64bit) \
libQt6LabsQmlModels.so.6(Qt_6.4)(64bit) \
libQt6LabsQmlModels.so.6(Qt_6.5)(64bit) \
libQt6LabsQmlModels.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6LabsQmlModels6 \
libQt6LabsQmlModels6(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6QmlModels.so.6()(64bit) \
libQt6QmlModels.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm