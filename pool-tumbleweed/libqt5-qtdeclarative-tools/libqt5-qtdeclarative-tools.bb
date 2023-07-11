SUMMARY = "Qt 5 Declarative Tools"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains aditional tools for inspecting, testing, viewing, etc, QML imports and files."
LICENSE = "GPL-3.0-only"

PV = "5.15.10+kde26"

RPM_NAME = "libqt5-qtdeclarative-tools-5.15.10+kde26-1.1.aarch64.rpm"
RPM_HASH = "38216a53931484aac3222f0f21855ac9224c1e2b1319b05e0e0528f8aa588589ec3f1769b04d4a45d411ee7eaf9d3a088c9e7cf960f7a1c18022c7bd2e22f3e6"

RPROVIDES:${PN} += "libqt5-qtdeclarative-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Qml.so.5 \
libQt5Quick.so.5 \
libQt5QuickTest.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
