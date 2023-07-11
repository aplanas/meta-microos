SUMMARY = "qpdfview plugin: Image files"
DESCRIPTION = "This plugin is required to read Image files \
(*.tiff files) with the qpdfview document viewer."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-plugin-image-0.5.0-1.4.aarch64.rpm"
RPM_HASH = "11f99cfc9c824ec593d9f562ccdea4600ebed5cdccf8edb741415621f8ccff79e2992d40933540ab0df028bec89d4f9aafe6d74e6a20abf371e37428fcf436c1"

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
