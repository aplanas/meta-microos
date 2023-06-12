SUMMARY = "Various tools for the Calligra Suite"
DESCRIPTION = "This package contains various tools for the Calligra Suite."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-tools-3.2.1-7.17.aarch64.rpm"
RPM_HASH = "c303266b07952465aeaa76c25abab8a72204273810ab7109deeacc27b91536709cb233612f5681b02315d93bcfabce0a3e91b295873a8c5611840c9a8aeda55b"

RPROVIDES:${PN} += "calligra-tools calligra-tools(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig calligra ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5I18n.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcalligrasheetscommon.so.17()(64bit) libcalligrasheetsodf.so.17()(64bit) libflake.so.17()(64bit) libkomain.so.17()(64bit) libkoodf.so.17()(64bit) libkopageapp.so.17()(64bit) libkoplugin.so.17()(64bit) libkowidgets.so.17()(64bit) libpoppler-qt5.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libwordsprivate.so.17()(64bit)"

inherit rpm
