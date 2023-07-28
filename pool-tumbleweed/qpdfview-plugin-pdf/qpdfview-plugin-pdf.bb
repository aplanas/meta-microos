SUMMARY = "qpdfview plugin: PDF documents"
DESCRIPTION = "This plugin is required to read PDF documents \
(*.pdf files) with the qpdfview document viewer."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-plugin-pdf-0.5.0-2.1.aarch64.rpm"
RPM_HASH = "a71358f17f4ec0d1e27c03b73e2a41ed3e1663e498e7a2d9d03761e3cdf962d98956db507ec5bc63abed0ea39048f9f7c89daf58dd1841355960d7799751885d"

RPROVIDES:${PN} += "libqpdfview-pdf.so \
qpdfview-plugin-pdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libpoppler-qt5.so.1 \
libstdc++.so.6 \
qpdfview"

inherit rpm
