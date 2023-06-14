SUMMARY = "Qt5 quick/qml examples"
DESCRIPTION = "Examples for libqt5-qtdeclarative (quick/qml) modules."
LICENSE = "BSD-3-Clause"

PV = "5.15.9+kde25"

RPM_NAME = "libqt5-qtdeclarative-examples-5.15.9+kde25-1.1.aarch64.rpm"
RPM_HASH = "123d37fc5be3cfb6517e49b0fdcec746f3df8b51e6eac3fdead879e4502367be042c7019ca17e909c3e0eb96b7a736de0f1bfe523da6979721cd12e3e9a3b1c8"

RPROVIDES:${PN} += "libchartsplugin.so \
libqmlimageproviderplugin.so \
libqmlimageresponseproviderplugin.so \
libqmlqtimeexampleplugin.so \
libqmltextballoonplugin.so \
libqt5-qtdeclarative-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickTest.so.5 \
libQt5QuickWidgets.so.5 \
libQt5Test.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
