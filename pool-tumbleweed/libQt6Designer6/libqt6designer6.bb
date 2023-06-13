SUMMARY = "Qt 6 Designer library"
DESCRIPTION = "This package contains the Qt 6 Designer Library."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "libQt6Designer6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8e71a20c56c5e5c2a9a8c9b4130e55751fc1d37d75c12749b3834cdbfa7802a2e469292f46fa3aeb54b6f7dcbabec00c30123698d10060382988f4aea2defa95"

RPROVIDES:${PN} += "libQt6Designer.so.6()(64bit) \
libQt6Designer.so.6(Qt_6)(64bit) \
libQt6Designer.so.6(Qt_6.0)(64bit) \
libQt6Designer.so.6(Qt_6.1)(64bit) \
libQt6Designer.so.6(Qt_6.2)(64bit) \
libQt6Designer.so.6(Qt_6.3)(64bit) \
libQt6Designer.so.6(Qt_6.4)(64bit) \
libQt6Designer.so.6(Qt_6.5)(64bit) \
libQt6Designer.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Designer6 \
libQt6Designer6(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6Core.so.6(Qt_6.5)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6OpenGLWidgets.so.6()(64bit) \
libQt6OpenGLWidgets.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6(Qt_6.5.1_PRIVATE_API)(64bit) \
libQt6Xml.so.6()(64bit) \
libQt6Xml.so.6(Qt_6)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
