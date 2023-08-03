SUMMARY = "Examples for the qt6-base modules"
DESCRIPTION = "Examples for the qt6-base modules."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-base-examples-6.5.2-1.1.aarch64.rpm"
RPM_HASH = "8ef2989a4d616d9113120c127f48ade1319bb4eef961852ebf2ffccb92faeff86f02da0a4363854bac161bf379aaf3d2aa04fc79a814b7726225fbea5b6f4db1"

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
