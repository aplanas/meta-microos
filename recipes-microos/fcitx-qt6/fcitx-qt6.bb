SUMMARY = "Qt6 IM module for Fcitx"
DESCRIPTION = "Qt6 IM module for Fcitx."
LICENSE = "BSD-3-Clause & GPL-2.0-or-later & GPL-3.0-or-later"

PV = "1.2.7"

RPM_NAME = "fcitx-qt6-1.2.7-1.23.aarch64.rpm"
RPM_HASH = "1b3e94555dffa241c31bfab17d42859451a47f25ebe5736d74174df1827f189fd7a5db11985ba67a4631631da12a53e479ca675eb3e63300eb60b5a88883422a"

RPROVIDES:${PN} += "fcitx-qt6 fcitx-qt6(aarch-64) libfcitxplatforminputcontextplugin-qt6.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libQt6Core.so.6()(64bit) libQt6Core.so.6(Qt_6)(64bit) libQt6Core.so.6(Qt_6.5)(64bit) libQt6DBus.so.6()(64bit) libQt6DBus.so.6(Qt_6)(64bit) libQt6Gui.so.6()(64bit) libQt6Gui.so.6(Qt_6)(64bit) libQt6Gui.so.6(Qt_6.5.0_PRIVATE_API)(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libxkbcommon.so.0()(64bit) libxkbcommon.so.0(V_0.5.0)(64bit)"

inherit rpm
