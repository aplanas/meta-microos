SUMMARY = "Commandline tool for conversion"
DESCRIPTION = "Commandline tool for conversion between any file formats for which \
there is a chain of Calligra import/export filters."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-converter-3.2.1-7.17.aarch64.rpm"
RPM_HASH = "ef45744708509b86d7eb86653c718265d6312548094865bb099b36369c7ec9af0bdf16f573bfe39c1af0fc390b0e1b0d657bea228b63d961664ca0728d49410e"

RPROVIDES:${PN} += "calligra-extras-converter"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libKF5KIOCore.so.5 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libkomain.so.17 \
libkostore.so.17 \
libstdc++.so.6"

inherit rpm
