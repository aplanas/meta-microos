SUMMARY = "Library with common classes and functionality used by finance applications"
DESCRIPTION = "libalkimia is a library with common classes and functionality used by finance \
applications."
LICENSE = "LGPL-2.1-or-later"

PV = "8.1.1"

RPM_NAME = "alkimia-8.1.1-1.4.aarch64.rpm"
RPM_HASH = "45f72ee213a58cb477499b85ef4409c1f9b7b039bfc6ac36b133b17f6afe04f0bd9103009c594f871ce6612d4d4b9e0c146eb6182c6268cfcf6610cfcf33c14f"

RPROVIDES:${PN} += "alkimia \
alkimia(aarch-64) \
application() \
application(org.kde.onlinequoteseditor5.desktop) \
libqmlalkimia.so()(64bit) \
metainfo() \
metainfo(org.kde.onlinequoteseditor5.appdata.xml) \
qt5qmlimport(org.kde.alkimia.1)"

RDEPENDS:${PN} += "/usr/bin/perl \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libKF5CoreAddons.so.5()(64bit) \
libKF5I18n.so.5()(64bit) \
libKF5XmlGui.so.5()(64bit) \
libQt5Core.so.5()(64bit) \
libQt5Core.so.5(Qt_5)(64bit) \
libQt5Gui.so.5()(64bit) \
libQt5Gui.so.5(Qt_5)(64bit) \
libQt5Qml.so.5()(64bit) \
libQt5Qml.so.5(Qt_5)(64bit) \
libQt5Widgets.so.5()(64bit) \
libQt5Widgets.so.5(Qt_5)(64bit) \
libalkimia5.so.8()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit)"

inherit rpm
