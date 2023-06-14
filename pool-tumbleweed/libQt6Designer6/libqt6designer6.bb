SUMMARY = "Qt 6 Designer library"
DESCRIPTION = "This package contains the Qt 6 Designer Library."
LICENSE = "GPL-3.0-only-WITH-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "libQt6Designer6-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "8e71a20c56c5e5c2a9a8c9b4130e55751fc1d37d75c12749b3834cdbfa7802a2e469292f46fa3aeb54b6f7dcbabec00c30123698d10060382988f4aea2defa95"

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
