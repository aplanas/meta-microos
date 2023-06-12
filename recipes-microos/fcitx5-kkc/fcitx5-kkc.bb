SUMMARY = "Libkkc input method support for Fcitx5"
DESCRIPTION = "This package provides libkkc input method support for Fcitx5."
LICENSE = "GPL-3.0-or-later"

PV = "5.0.12"

RPM_NAME = "fcitx5-kkc-5.0.12-1.1.aarch64.rpm"
RPM_HASH = "2529db5ca0828eb6a3829988f6ec29b54badd3af91109c51302646775c053798a1e9ce2f55a0ae0620aa6179d0cd6212b8b54139d1b6c462c985314b398307e2"

RPROVIDES:${PN} += "fcitx-kkc fcitx5-kkc fcitx5-kkc(aarch-64) libfcitx5-kkc-config.so()(64bit) metainfo() metainfo(org.fcitx.Fcitx5.Addon.Kkc.metainfo.xml)"
RDEPENDS:${PN} += "fcitx5 kkc-data ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFcitx5Config.so.6()(64bit) libFcitx5Core.so.7()(64bit) libFcitx5Qt5WidgetsAddons.so.2()(64bit) libFcitx5Utils.so.2()(64bit) libQt5Core.so.5()(64bit) libQt5Core.so.5(Qt_5)(64bit) libQt5Gui.so.5()(64bit) libQt5Gui.so.5(Qt_5)(64bit) libQt5Widgets.so.5()(64bit) libQt5Widgets.so.5(Qt_5)(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libglib-2.0.so.0()(64bit) libgobject-2.0.so.0()(64bit) libkkc.so.2()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
