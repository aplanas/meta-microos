SUMMARY = "Documentation browser"
DESCRIPTION = "Qt Assistant is a tool for viewing documentation in Qt help file format."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "6.5.1"

RPM_NAME = "qt6-tools-assistant-6.5.1-3.1.aarch64.rpm"
RPM_HASH = "e43df6a2720dde6132c89ff4094de51b4555e3fa844e94c0fbb5aa7ef5509801f49a0fff3c09a1ad815025bd0b65983ded70df599de34510b62010a7371abdc5"

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
