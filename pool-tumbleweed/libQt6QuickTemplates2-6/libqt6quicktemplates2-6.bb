SUMMARY = "Qt 6 QuickTemplates2 library"
DESCRIPTION = "The Qt 6 QuickTemplates2 library."
LICENSE = "GPL-2.0-only | GPL-3.0-or-later | LGPL-3.0-only"

PV = "6.5.2"

RPM_NAME = "libQt6QuickTemplates2-6-6.5.2-2.1.aarch64.rpm"
RPM_HASH = "bbf6b20dc260b9dcc628bc058ffa7280f8a376583bf346d4ec0fd0f7496ddea62811252df481b05108b0b08989f147ee6090136d1698b1677725675a1322d620"

RPROVIDES:${PN} += "libQt6QuickTemplates2-6 \
libQt6QuickTemplates2.so.6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6QmlModels.so.6 \
libQt6Quick.so.6 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
