SUMMARY = "Qt5 PDF library for Qt Widgets"
DESCRIPTION = "Library of the Qt PDF module with support for Qt Widgets."
LICENSE = "LGPL-3.0-only | GPL-2.0-only | GPL-3.0-only"

PV = "5.15.14"

RPM_NAME = "libQt5PdfWidgets5-5.15.14-1.1.aarch64.rpm"
RPM_HASH = "f64e09c9338adcd4d79a38c93f4d5342f11befdab20534e61ae4baf265dc16ba5d838bbce0dd5ccb10842ad95c8650ee1457853f95d810f9a35e03eb57ae8cc3"

RPROVIDES:${PN} += "libQt5PdfWidgets.so.5()(64bit) \
libQt5PdfWidgets.so.5(Qt_5)(64bit) \
libQt5PdfWidgets.so.5(Qt_5.0)(64bit) \
libQt5PdfWidgets.so.5(Qt_5.1)(64bit) \
libQt5PdfWidgets.so.5(Qt_5.10)(64bit) \
libQt5PdfWidgets.so.5(Qt_5.11)(64bit) \
libQt5PdfWidgets.so.5(Qt_5.12)(64bit) \
libQt5PdfWidgets.so.5(Qt_5.13)(64bit) \
libQt5PdfWidgets.so.5(Qt_5.14)(64bit) \
libQt5PdfWidgets.so.5(Qt_5.15)(64bit) \
libQt5PdfWidgets.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libQt5PdfWidgets.so.5(Qt_5.2)(64bit) \
libQt5PdfWidgets.so.5(Qt_5.3)(64bit) \
libQt5PdfWidgets.so.5(Qt_5.4)(64bit) \
libQt5PdfWidgets.so.5(Qt_5.5)(64bit) \
libQt5PdfWidgets.so.5(Qt_5.6)(64bit) \
libQt5PdfWidgets.so.5(Qt_5.7)(64bit) \
libQt5PdfWidgets.so.5(Qt_5.8)(64bit) \
libQt5PdfWidgets.so.5(Qt_5.9)(64bit) \
libQt5PdfWidgets5 \
libQt5PdfWidgets5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Pdf.so.5()(64bit) \
libQt5Pdf.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5(Qt_5.15.9_PRIVATE_API)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm