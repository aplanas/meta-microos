SUMMARY = "qpdfview plugin: DjVu documents"
DESCRIPTION = "This plugin is required to read DjVu documents \
(*.djvu files) with the qpdfview document viewer."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-plugin-djvu-0.5.0-1.4.aarch64.rpm"
RPM_HASH = "45800d862f1b5d098cdf8ae7e9c0931e0c814cf893e89b8d054807dcde8aeb401c03eefb2d7b4837b64c3d172520eb860f1d8a0a16f2db44e2245e585c1a4317"

RPROVIDES:${PN} += "libqpdfview-djvu.so \
qpdfview-plugin-djvu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libdjvulibre.so.21 \
libgcc-s.so.1 \
libstdc++.so.6 \
qpdfview"

inherit rpm
