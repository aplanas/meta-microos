SUMMARY = "Graphical User Interface for Doxygen"
DESCRIPTION = "Doxywizard is a graphical front-end to read/edit/write doxygen \
configuration files."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "1.9.6"

RPM_NAME = "doxywizard-1.9.6-4.1.aarch64.rpm"
RPM_HASH = "6963657d274c21c712f1d7ea16d2fc8a34718e6da85a19163047c6251b71eb409491d9059dc5f7127a68ed23b626e2d24fd17068c4f018ed1674871cd58416f7"

RPROVIDES:${PN} += "application() application(doxywizard.desktop) doxywizard doxywizard(aarch-64)"
RDEPENDS:${PN} += "doxygen ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libQt5Xml.so.5()(64bit) libQt5Xml.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit)"

inherit rpm
