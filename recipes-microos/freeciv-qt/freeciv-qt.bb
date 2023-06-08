SUMMARY = "Qt client for freeciv"
DESCRIPTION = "Freeciv executable using Qt library"
LICENSE = "GPL-2.0-or-later"

PV = "3.0.7"

RPM_NAME = "freeciv-qt-3.0.7-1.1.aarch64.rpm"
RPM_HASH = "0dab024c85afb6d28c7d7cd3c1c222931cc7a00af6e949d0ca17dd5990e0fca066735eb250bcef32b8c425857c89bcddf5599cf5b944b3408f119fe446a6b9f5"

RPROVIDES:${PN} += "application() application(org.freeciv.qt.desktop) freeciv-qt freeciv-qt(aarch-64) freeciv_client-3.0.7 metainfo() metainfo(org.freeciv.qt.appdata.xml)"
RDEPENDS:${PN} += "freeciv ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libSDL2-2.0.so.0()(64bit) libSDL2_mixer-2.0.so.0()(64bit) libbz2.so.1()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcurl.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libicuuc.so.72()(64bit) liblzma.so.5()(64bit) liblzma.so.5(XZ_5.0)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libz.so.1()(64bit)"

inherit rpm
