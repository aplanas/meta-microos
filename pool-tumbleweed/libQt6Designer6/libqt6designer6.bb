SUMMARY = "Qt 6 Designer library"
DESCRIPTION = "This package contains the Qt 6 Designer Library."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "libQt6Designer6-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "d9183b5c44640494d6a8b1715e4de62999d35c6aec110b2a2bdb0637f89b60b54ea0f1d1d616b92a1063bda4fd747d9cf8d55def2cdd7f1386c00eb386be7936"

RPROVIDES:${PN} += "libQt6Designer.so.6 \
libQt6Designer6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
