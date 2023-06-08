SUMMARY = "M17n input method engine for Fcitx5"
DESCRIPTION = "M17n input method engine for Fcitx5."
LICENSE = "LGPL-2.1-or-later"

PV = "5.0.11"

RPM_NAME = "fcitx5-m17n-5.0.11-1.3.aarch64.rpm"
RPM_HASH = "a7181663ba78919d1c8b1e880f06d56bef666a96ca2ab8f71537f868570e6a1bba0f08e3da0e3696c1380219d854eeeba0ab537087959a5e228d4e8465d96532"

RPROVIDES:${PN} += "fcitx-m17n fcitx5-m17n fcitx5-m17n(aarch-64) metainfo() metainfo(org.fcitx.Fcitx5.Addon.M17N.metainfo.xml)"
RDEPENDS:${PN} += "fcitx5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFcitx5Config.so.6()(64bit) libFcitx5Core.so.7()(64bit) libFcitx5Utils.so.2()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libgcc_s.so.1(GCC_4.5.0)(64bit) libm17n-core.so.0()(64bit) libm17n.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) m17n-db"

inherit rpm
