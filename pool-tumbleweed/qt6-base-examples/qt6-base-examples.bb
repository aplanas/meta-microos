SUMMARY = "Examples for the qt6-base modules"
DESCRIPTION = "Examples for the qt6-base modules."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-base-examples-6.5.1-1.1.aarch64.rpm"
RPM_HASH = "497853721faeb4375dccf0aba17e97559e0f3e131d41a1ed4796ed19fafd82bc1ff80e1e83fab91ef82a3b84b2d4f137ccc34c3ebcc62a05eb4595ed35265d87"

RPROVIDES:${PN} += "libechoplugin.so()(64bit) \
libpnp_extrafilters.so()(64bit) \
libsimplestyleplugin.so()(64bit) \
qt6-base-examples \
qt6-base-examples(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libQt6Concurrent.so.6()(64bit) \
libQt6Concurrent.so.6(Qt_6)(64bit) \
libQt6Core.so.6()(64bit) \
libQt6Core.so.6(Qt_6)(64bit) \
libQt6DBus.so.6()(64bit) \
libQt6DBus.so.6(Qt_6)(64bit) \
libQt6Gui.so.6()(64bit) \
libQt6Gui.so.6(Qt_6)(64bit) \
libQt6Network.so.6()(64bit) \
libQt6Network.so.6(Qt_6)(64bit) \
libQt6OpenGL.so.6()(64bit) \
libQt6OpenGL.so.6(Qt_6)(64bit) \
libQt6OpenGLWidgets.so.6()(64bit) \
libQt6OpenGLWidgets.so.6(Qt_6)(64bit) \
libQt6PrintSupport.so.6()(64bit) \
libQt6PrintSupport.so.6(Qt_6)(64bit) \
libQt6Sql.so.6()(64bit) \
libQt6Sql.so.6(Qt_6)(64bit) \
libQt6Test.so.6()(64bit) \
libQt6Test.so.6(Qt_6)(64bit) \
libQt6Widgets.so.6()(64bit) \
libQt6Widgets.so.6(Qt_6)(64bit) \
libQt6Xml.so.6()(64bit) \
libQt6Xml.so.6(Qt_6)(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
