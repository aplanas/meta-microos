SUMMARY = "Qt5 quick/qml examples"
DESCRIPTION = "Examples for libqt5-qtdeclarative (quick/qml) modules."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde25"

RPM_NAME = "libqt5-qtdeclarative-examples-5.15.9+kde25-1.1.aarch64.rpm"
RPM_HASH = "123d37fc5be3cfb6517e49b0fdcec746f3df8b51e6eac3fdead879e4502367be042c7019ca17e909c3e0eb96b7a736de0f1bfe523da6979721cd12e3e9a3b1c8"

RPROVIDES:${PN} += "libchartsplugin.so()(64bit) \
libqmlimageproviderplugin.so()(64bit) \
libqmlimageresponseproviderplugin.so()(64bit) \
libqmlqtimeexampleplugin.so()(64bit) \
libqmltextballoonplugin.so()(64bit) \
libqt5-qtdeclarative-examples \
libqt5-qtdeclarative-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Gui.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5Network.so.5()(64bit) \
libQt5Network.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Quick.so.5()(64bit) \
libQt5Quick.so.5(Qt_5)(64bit) \
libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5QuickTest.so.5()(64bit) \
libQt5QuickTest.so.5(Qt_5)(64bit) \
libQt5QuickWidgets.so.5()(64bit) \
libQt5QuickWidgets.so.5(Qt_5)(64bit) \
libQt5Test.so.5()(64bit) \
libQt5Test.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
