SUMMARY = "qpdfview plugin: DjVu documents"
DESCRIPTION = "This plugin is required to read DjVu documents \
(*.djvu files) with the qpdfview document viewer."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.0"

RPM_NAME = "qpdfview-plugin-djvu-0.5.0-2.1.aarch64.rpm"
RPM_HASH = "4b6362bb2348ed0aa2b378b86500a0d4b0749499f18e96c6966269a8e65d81e640a61e4e9c68ec21dbced0a8fedcd9ed3a4fd937d0656e548f7a8ef9318239fd"

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
