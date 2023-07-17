SUMMARY = "Qt5 base examples"
DESCRIPTION = "Examples for the libqt5-qtbase modules."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libqt5-qtbase-examples-5.15.10+kde129-2.1.aarch64.rpm"
RPM_HASH = "4ac31b3cdc628088f41b3e7b8f62dc47f15f60c812f6c98711ee62e4e20e6b731104f6f53bc6ad17dfd0db69f1738fadeb4f001824732b451489916457d6b88b"

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
