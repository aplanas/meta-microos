SUMMARY = "Qt 6 Qml library"
DESCRIPTION = "The Qt 6 Qml library."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "6.5.1"

RPM_NAME = "libQt6Qml6-6.5.1-1.2.aarch64.rpm"
RPM_HASH = "089c9019a3ad4182a2a3b82ff6f9370ac7882af46048fce3bf3702a2d4811dd25129714f7461041ce4fd8258b78e107cc090348fbc0cebdb2adfe35d4cce0407"

RPROVIDES:${PN} += "libQt6Qml.so.6()(64bit) \
libQt6Qml.so.6(Qt_6)(64bit) \
libQt6Qml.so.6(Qt_6.0)(64bit) \
libQt6Qml.so.6(Qt_6.1)(64bit) \
libQt6Qml.so.6(Qt_6.2)(64bit) \
libQt6Qml.so.6(Qt_6.3)(64bit) \
libQt6Qml.so.6(Qt_6.4)(64bit) \
libQt6Qml.so.6(Qt_6.5)(64bit) \
libQt6Qml.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Qml6 \
libQt6Qml6(aarch-64)"
RDEPENDS:${PN} += "(qml-autoreqprov if rpm-build) \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Core.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
qt6-declarative-imports"

inherit rpm
