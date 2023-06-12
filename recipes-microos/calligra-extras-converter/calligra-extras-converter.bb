SUMMARY = "Commandline tool for conversion"
DESCRIPTION = "Commandline tool for conversion between any file formats for which \
there is a chain of Calligra import/export filters."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-converter-3.2.1-7.17.aarch64.rpm"
RPM_HASH = "ef45744708509b86d7eb86653c718265d6312548094865bb099b36369c7ec9af0bdf16f573bfe39c1af0fc390b0e1b0d657bea228b63d961664ca0728d49410e"

RPROVIDES:${PN} += "calligra-extras-converter calligra-extras-converter(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkomain.so.17()(64bit) libkostore.so.17()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
