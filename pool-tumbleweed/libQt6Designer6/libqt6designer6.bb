SUMMARY = "Qt 6 Designer library"
DESCRIPTION = "This package contains the Qt 6 Designer Library."
LICENSE = "GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.2"

RPM_NAME = "libQt6Designer6-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "ca7fcedc30e83e9045f2507905bf8b1c5cef471ede11e81b239a1a1e958796f2b1e87a901d25990ce7d7acfb6b76082109705ed272987bd50ebd1e54f67cb847"

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
