SUMMARY = "Qt 6 QuickEffects library"
DESCRIPTION = "The Qt 6 QuickEffects library. \
This library does not have any ABI or API guarantees."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6QuickEffects6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "b84ce311a79c4d66b943c934315ea48cea8901dbb0c324eaee44d630db43021b3980a247107a7690f5356fc9d04f2c2cf34a8cccb3dcd598d8e5e563320244f8"

RPROVIDES:${PN} += "libQt6QuickEffects.so.6()(64bit) \
libQt6QuickEffects.so.6(Qt_6)(64bit) \
libQt6QuickEffects.so.6(Qt_6.0)(64bit) \
libQt6QuickEffects.so.6(Qt_6.1)(64bit) \
libQt6QuickEffects.so.6(Qt_6.2)(64bit) \
libQt6QuickEffects.so.6(Qt_6.3)(64bit) \
libQt6QuickEffects.so.6(Qt_6.4)(64bit) \
libQt6QuickEffects.so.6(Qt_6.5)(64bit) \
libQt6QuickEffects.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6QuickEffects6 \
libQt6QuickEffects6(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Quick.so.6()(64bit) \
libQt6Quick.so.6(Qt_6)(64bit) \
libQt6Quick.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
