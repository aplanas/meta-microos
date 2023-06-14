SUMMARY = "qpdfview plugin: PDF documents"
DESCRIPTION = "This plugin is required to read PDF documents \
(*.pdf files) with the qpdfview document viewer."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-plugin-pdf-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "ae940d769cf69f2582e9b3ba2744e2cf0f3fd7df2836b0b6623ed0f718a415f045f4dc8c0e37b90e08305b140aa3227466932b5d5956f96a89fd3749ce996da3"

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
