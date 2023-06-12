SUMMARY = "Terminal emulator which mimics old screens"
DESCRIPTION = "cool-retro-term is a terminal emulator which tries to mimic the look and feel \
of the old cathode tube screens. It has been designed to be eye-candy, \
customizable, and reasonably lightweight."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.0"

RPM_NAME = "cool-retro-term-1.2.0-2.1.aarch64.rpm"
RPM_HASH = "6afbaec59882a48a00ab8ba63143d58590eae54508bfa2cbf31b337a8ecc742dbdcafdae428196018e8093b8792f10b5008ad73d26addaf4d7ee79bc2abe5595"

RPROVIDES:${PN} += "application() application(cool-retro-term.desktop) cool-retro-term cool-retro-term(aarch-64) libqmltermwidget.so()(64bit) qt5qmlimport(QMLTermWidget.1)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Network.so.5()(64bit) libQt5Network.so.5(Qt_5)(64bit) libQt5Qml.so.5()(64bit) libQt5Qml.so.5(Qt_5)(64bit) libQt5Quick.so.5()(64bit) libQt5Quick.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) qt5qmlimport(QMLTermWidget.1) qt5qmlimport(QtQuick.2)"

inherit rpm
