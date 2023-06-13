SUMMARY = "Qt 5 3D Addon"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
The Qt 3D Input module provides classes for handling user input in \
applications using Qt3D."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.9+kde0"

RPM_NAME = "libQt53DInput5-5.15.9+kde0-1.1.aarch64.rpm"
RPM_HASH = "a293ec5934a2ebd588f54e6264def9a4911bdd9bce6f7270c399baaf341acde53b4628ab1c73f862ac9831c36417cdabe7668650efabfd8792f574f64f9f34d3"

RPROVIDES:${PN} += "libQt53DInput.so.5()(64bit) \
libQt53DInput.so.5(Qt_5)(64bit) \
libQt53DInput.so.5(Qt_5.0)(64bit) \
libQt53DInput.so.5(Qt_5.1)(64bit) \
libQt53DInput.so.5(Qt_5.10)(64bit) \
libQt53DInput.so.5(Qt_5.11)(64bit) \
libQt53DInput.so.5(Qt_5.12)(64bit) \
libQt53DInput.so.5(Qt_5.13)(64bit) \
libQt53DInput.so.5(Qt_5.14)(64bit) \
libQt53DInput.so.5(Qt_5.15)(64bit) \
libQt53DInput.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt53DInput.so.5(Qt_5.2)(64bit) \
libQt53DInput.so.5(Qt_5.3)(64bit) \
libQt53DInput.so.5(Qt_5.4)(64bit) \
libQt53DInput.so.5(Qt_5.5)(64bit) \
libQt53DInput.so.5(Qt_5.6)(64bit) \
libQt53DInput.so.5(Qt_5.7)(64bit) \
libQt53DInput.so.5(Qt_5.8)(64bit) \
libQt53DInput.so.5(Qt_5.9)(64bit) \
libQt53DInput5 \
libQt53DInput5(aarch-64)"

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
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
