SUMMARY = "Examples for the qt6-base modules"
DESCRIPTION = "Examples for the qt6-base modules."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-base-examples-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "3b0488e20ed6516d8090bc765c6e8fdf68d2bae225b2a4ab884e0c71d87779e0cedaaef970f5e2345be8aa70b6c088acc16052fc56eae86227d209c436bd46e9"

RPROVIDES:${PN} += "libechoplugin.so \
libpnp-extrafilters.so \
libsimplestyleplugin.so \
qt6-base-examples"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGL.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6PrintSupport.so.6 \
libQt6Sql.so.6 \
libQt6Test.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
