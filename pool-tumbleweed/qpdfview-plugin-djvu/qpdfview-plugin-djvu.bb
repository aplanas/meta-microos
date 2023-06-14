SUMMARY = "qpdfview plugin: DjVu documents"
DESCRIPTION = "This plugin is required to read DjVu documents \
(*.djvu files) with the qpdfview document viewer."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-plugin-djvu-0.5.0-1.3.aarch64.rpm"
RPM_HASH = "30e767b7b683ea8c5896d7d9b738954cbf6a5f7a328988abc572e292c2382687f2364f0a172d91fd8d5f68c657995a80e36bcf71b2368571c6ab1d167ddf375e"

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
