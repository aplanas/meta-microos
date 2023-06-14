SUMMARY = "qpdfview plugin: Image files"
DESCRIPTION = "This plugin is required to read Image files \
(*.tiff files) with the qpdfview document viewer."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-plugin-image-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "c4edcdb4364a3d0ceaf7a7d3e538d52366d33c5d9ef1bbc8719ce62076afa25281d24f3b575b6f32a6cc22b4838d5c0283db58fcd1c764478b0787da98afb6e2"

RPROVIDES:${PN} += "libqpdfview-image.so \
qpdfview-plugin-image"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
qpdfview"

inherit rpm
