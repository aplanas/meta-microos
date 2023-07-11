SUMMARY = "qpdfview plugin: PDF documents"
DESCRIPTION = "This plugin is required to read PDF documents \
(*.pdf files) with the qpdfview document viewer."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-plugin-pdf-0.5.0-1.4.aarch64.rpm"
RPM_HASH = "6bfd88d8a763e8ddde8e7ac0bef439de7b5ef7dcf5c8c5928bc124563dac89979d3d4f73e1e1b579f5b60ed7b1669e2efa24e0cb9c4d113bb4661a40476e7916"

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
