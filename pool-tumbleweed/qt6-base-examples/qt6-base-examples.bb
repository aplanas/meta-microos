SUMMARY = "Examples for the qt6-base modules"
DESCRIPTION = "Examples for the qt6-base modules."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-base-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "497853721faeb4375dccf0aba17e97559e0f3e131d41a1ed4796ed19fafd82bc1ff80e1e83fab91ef82a3b84b2d4f137ccc34c3ebcc62a05eb4595ed35265d87"

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
