SUMMARY = "Commandline tool for conversion"
DESCRIPTION = "Commandline tool for conversion between any file formats for which \
there is a chain of Calligra import/export filters."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-extras-converter-3.2.1-7.16.aarch64.rpm"
RPM_HASH = "9e69d79a15eb37749466d54b664692273ebe91ff127396b17db8cf747fb94bee647ca746291382a60e28439244ee567123ed8ad1c6f1b4acae2984ad70b2276c"

RPROVIDES:${PN} += "calligra-extras-converter calligra-extras-converter(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libKF5CoreAddons.so.5()(64bit) libKF5I18n.so.5()(64bit) libKF5KIOCore.so.5()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5PrintSupport.so.5()(64bit) libQt5PrintSupport.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.34)(64bit) libkomain.so.17()(64bit) libkostore.so.17()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
