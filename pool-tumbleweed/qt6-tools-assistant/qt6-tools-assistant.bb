SUMMARY = "Documentation browser"
DESCRIPTION = "Qt Assistant is a tool for viewing documentation in Qt help file format."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-assistant-6.5.1-2.1.aarch64.rpm"
RPM_HASH = "688b764207a985f2b068674429c9ab25ac9d2c0ecd87a6ceeddd9af89ec2d32cfc2acdc1c67541bb04020cc4665344a4db858198a8e656ceb6d8e76023ac1779"

RPROVIDES:${PN} += "qt6-tools-assistant"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Help.so.6 \
libQt6PrintSupport.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
