SUMMARY = "Qt5 base examples"
DESCRIPTION = "Examples for the libqt5-qtbase modules."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libqt5-qtbase-examples-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "a7ae0c6f5eba4d54c1297d61055cff32bb9b480d38d784aa456a5a118d2b246a4610ab9840d328a2234444391c481d666bdf901a46a414ec506be34c5f8a8bd5"

RPROVIDES:${PN} += "libechoplugin.so \
libpnp-extrafilters.so \
libqt5-qtbase-examples \
libsimplestyleplugin.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Concurrent.so.5 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5OpenGL.so.5 \
libQt5PrintSupport.so.5 \
libQt5Sql.so.5 \
libQt5Test.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
