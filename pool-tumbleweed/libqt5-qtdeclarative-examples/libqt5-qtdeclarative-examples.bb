SUMMARY = "Qt5 quick/qml examples"
DESCRIPTION = "Examples for libqt5-qtdeclarative (quick/qml) modules."
LICENSE = "BSD-3-Clause"

PV = "5.15.10+kde26"

RPM_NAME = "libqt5-qtdeclarative-examples-5.15.10+kde26-1.1.aarch64.rpm"
RPM_HASH = "858ac2517e3b321410bdeb4a97b86a6d5f779164eb5e4c9a1d2b397cc0252131e9209986303755212a2fc8ba2fce4dcdfb26045b1f32dea9947e1bba99491e9b"

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
