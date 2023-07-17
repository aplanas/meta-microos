SUMMARY = "Qt5 PDF library for Qt Widgets"
DESCRIPTION = "Library of the Qt PDF module with support for Qt Widgets."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libQt5PdfWidgets5-5.15.14-1.4.aarch64.rpm"
RPM_HASH = "b8afa045c177faae21152688aef48bd1df6f8df2d00258702a7b3019c511369b2912cb6fa494940b1e9c941e0d08fb1242ebea79815a57bb66c8bedaef8c17b2"

RPROVIDES:${PN} += "libQt5PdfWidgets.so.5 \
libQt5PdfWidgets5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Pdf.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
