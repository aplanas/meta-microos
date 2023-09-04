SUMMARY = "Examples for the qt6-base modules"
DESCRIPTION = "Examples for the qt6-base modules."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-base-examples-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "811ccefb596390f53b75eb6097d73ea591d0ed1ca6161a1e52832073629775031a686d3345259784d9057a95ae181ed1ca912538a4b105a4711e1ac1f4e09a4b"

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
