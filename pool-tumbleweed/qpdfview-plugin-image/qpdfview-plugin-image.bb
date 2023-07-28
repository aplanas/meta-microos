SUMMARY = "qpdfview plugin: Image files"
DESCRIPTION = "This plugin is required to read Image files \
(*.tiff files) with the qpdfview document viewer."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-plugin-image-0.5.0-2.1.aarch64.rpm"
RPM_HASH = "33d8655d9a5f3bbfc704e43dca263448ff29b868a7a85afaa907dc511f63e3de574b29510e119c8387cf137c681952a6e362ecf8157088c2c51e40d15df9b400"

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
