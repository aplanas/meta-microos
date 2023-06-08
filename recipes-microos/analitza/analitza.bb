SUMMARY = "A library to add mathematical features to programs"
DESCRIPTION = "The Analitza library lets developers add mathematical features to programs."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "analitza-23.04.0-1.1.aarch64.rpm"
RPM_HASH = "82c97256a4bee95f13d735a53619bd3a39525440f5e1a26ec8ebacae334e7b2f551ab686891dfd74b61580496156717ba521795a70cff447b363e2b754118e4d"

RPROVIDES:${PN} += "analitza analitza(aarch-64) analitza5 libanalitzadeclarativeplugin.so()(64bit) qt5qmlimport(org.kde.analitza.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libAnalitza.so.8()(64bit) libAnalitza8 libAnalitzaGui.so.8()(64bit) libAnalitzaPlot.so.8()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Quick.so.5(Qt_5.15.9_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) qt5qmlimport(QtQuick.2) qt5qmlimport(QtQuick.Layouts.1) qt5qmlimport(org.kde.analitza.1)"

inherit rpm
