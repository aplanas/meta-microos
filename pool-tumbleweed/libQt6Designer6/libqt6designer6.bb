SUMMARY = "Qt 6 Designer library"
DESCRIPTION = "This package contains the Qt 6 Designer Library."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "libQt6Designer6-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "5321dcbf4b99ffa609a43daf233be7ca6637af0c6c653ea148f2cd69164ccd4f7bc54fea9b179c1a9b43ef0e303f271d4f7cf7d407d65a3490097584c6b17cf1"

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
