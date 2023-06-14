SUMMARY = "Qt5 base examples"
DESCRIPTION = "Examples for the libqt5-qtbase modules."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.9+kde154"

RPM_NAME = "libqt5-qtbase-examples-5.15.9+kde154-1.2.aarch64.rpm"
RPM_HASH = "ae0e59f6557fc38cd5e6a5e397aa0645e0f345a0536ab564b8e1616d8f53fd8a4e782791e8984b9ed76179513eaf1179ca7d22d417d92cca31eb03a43c474c69"

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
