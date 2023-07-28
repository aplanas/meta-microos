SUMMARY = "qpdfview plugin: PostScript documents"
DESCRIPTION = "This plugin is required to read PostScript documents \
(*.ps files) with the qpdfview document viewer."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-plugin-ps-0.5.0-2.1.aarch64.rpm"
RPM_HASH = "0a2a663c28b378a9305c117344b36438a4063719747397702f280623f5298a97ff19caadfc886993dae7e975fb2a347bfb6f0aed420537b82bce372ec68cd6fa"

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
