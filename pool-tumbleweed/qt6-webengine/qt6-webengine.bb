SUMMARY = "Web browser engine for Qt applications"
DESCRIPTION = "The Qt WebEngine module provides a web browser engine to embed web content into \
Qt applications. \
The functionality in Qt WebEngine is divided into the following \
modules: \
* Qt WebEngine Core module for interacting with Chromium \
* Qt WebEngine Widgets module for creating widget-based web applications \
* Qt WebEngine module for creating Qt Quick based web applications"
LICENSE = "GPL-2.0-only | LGPL-3.0-only | GPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "qt6-webengine-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "4248be7e835c53ae39cd0fe675389fcec2ca0e977e15d6104eaf0a083d434cba405c4785675727e1a8a596dc273eefdd3865b60ec2056b92d8e12a72f77264fc"

RPROVIDES:${PN} += "libqwebengineview.so \
qt6-webengine"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Quick.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
