SUMMARY = "qpdfview plugin: PostScript documents"
DESCRIPTION = "This plugin is required to read PostScript documents \
(*.ps files) with the qpdfview document viewer."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-plugin-ps-0.5.0-1.4.aarch64.rpm"
RPM_HASH = "9c6e3c1cb1594a3dce550a1461b6c8636dfc32320b3a72a8ffdda9e75c56cbec341758f49e797a0c6db80c62f7766a17afb34be79d94c239e4624a72792b39e3"

RPROVIDES:${PN} += "libqpdfview-ps.so \
qpdfview-plugin-ps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libspectre.so.1 \
libstdc++.so.6 \
qpdfview"

inherit rpm
