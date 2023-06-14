SUMMARY = "Qt 5 Declarative Tools"
DESCRIPTION = "Qt is a set of libraries for developing applications. \
 \
This package contains aditional tools for inspecting, testing, viewing, etc, QML imports and files."
LICENSE = "GPL-3.0-only"

PV = "5.15.9+kde25"

RPM_NAME = "libqt5-qtdeclarative-tools-5.15.9+kde25-1.1.aarch64.rpm"
RPM_HASH = "10a322cd8985df0593125185d88631ab4080a403decaa69c36e74dac8ef67d9dfc7a9eb820ade3f511884a6d31cc675c690de602dd245c67b83ac3e6381c0bd5"

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
