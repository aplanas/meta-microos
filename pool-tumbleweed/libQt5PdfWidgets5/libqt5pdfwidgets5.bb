SUMMARY = "Qt5 PDF library for Qt Widgets"
DESCRIPTION = "Library of the Qt PDF module with support for Qt Widgets."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.15"

RPM_NAME = "libQt5PdfWidgets5-5.15.15-1.1.aarch64.rpm"
RPM_HASH = "ef6713a66974001686c17dfdc221289fadf9602127c4b0d3670f1e5a482207be216223d21685092d2b8d393036a5006880ce107915f76907d054c052edae17e4"

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
