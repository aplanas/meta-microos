SUMMARY = "Qt and QML MPRIS interface and adaptor"
DESCRIPTION = "MPRIS v.2 specification implementation for Qt and QML plugin."
LICENSE = "LGPL-2.1+"

PV = "1.0.6"

RPM_NAME = "qtmpris-1.0.6-2.7.aarch64.rpm"
RPM_HASH = "8b1c19009471325510d7085424bd04cf3cdcd0bfde7141f5848287a2c27c823dc591c2e5715b659e1edf55b3a221797672da23691856eea70fac3c521221b53e"

RPROVIDES:${PN} += "libmpris-qt5-qml-plugin.so()(64bit) \
qt5qmlimport(org.nemomobile.mpris.1) \
qtmpris \
qtmpris(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libmpris-qt5.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
