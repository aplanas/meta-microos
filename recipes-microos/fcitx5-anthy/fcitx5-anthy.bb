SUMMARY = "Anthy Wrapper for Fcitx5"
DESCRIPTION = "Anthy Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.13"

RPM_NAME = "fcitx5-anthy-5.0.13-1.3.aarch64.rpm"
RPM_HASH = "16ad69631ebbefcd4ea5df6e62a64b640f6aa16a99736ef2267989ce6fb8000e5a142f7b3437efc3a89bb555e0edef376263d1c600f2406a12b1c43ab46c78d8"

RPROVIDES:${PN} += "fcitx-anthy fcitx5-anthy fcitx5-anthy(aarch-64) metainfo() metainfo(org.fcitx.Fcitx5.Addon.Anthy.metainfo.xml)"
RDEPENDS:${PN} += "anthy fcitx5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFcitx5Config.so.6()(64bit) libFcitx5Core.so.7()(64bit) libFcitx5Utils.so.2()(64bit) libanthy.so.0()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.11)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
