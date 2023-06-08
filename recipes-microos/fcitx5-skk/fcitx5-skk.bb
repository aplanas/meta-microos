SUMMARY = "Libskk input method engine for Fcitx5"
DESCRIPTION = "fcitx-skk is an input method engine for Fcitx, which uses libskk as its backend."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.14"

RPM_NAME = "fcitx5-skk-5.0.14-1.3.aarch64.rpm"
RPM_HASH = "192891819664cf5a210ea7453921d13c9decc6e1fb0f8f41487b5b5aad4fedde6d5c08bef817d4446d1ddf10d8e4e8fcfa796e3b85fc5f48945567f159b53c8e"

RPROVIDES:${PN} += "fcitx-skk fcitx5-skk fcitx5-skk(aarch-64) libfcitx5-skk-config.so()(64bit) metainfo() metainfo(org.fcitx.Fcitx5.Addon.Skk.metainfo.xml)"
RDEPENDS:${PN} += "fcitx5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFcitx5Config.so.6()(64bit) libFcitx5Core.so.7()(64bit) libFcitx5Qt5WidgetsAddons.so.2()(64bit) libFcitx5Utils.so.2()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libskk.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
