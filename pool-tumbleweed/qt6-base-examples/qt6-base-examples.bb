SUMMARY = "Examples for the qt6-base modules"
DESCRIPTION = "Examples for the qt6-base modules."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-base-examples-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "69151d9f8cc8712afa0e9888f0da770a8fd8a71642645fec0b6a14728a03f1a5f1abca9f6feb8a9edd5592a6e62afae23596ac87794cf0abc3932d1e52a211df"

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
