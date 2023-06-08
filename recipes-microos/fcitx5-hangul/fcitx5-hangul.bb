SUMMARY = "Hangul Wrapper for Fcitx5"
DESCRIPTION = "Hangul Wrapper for Fcitx5."
LICENSE = "LGPL-2.1-only"

PV = "5.0.8"

RPM_NAME = "fcitx5-hangul-5.0.8-1.7.aarch64.rpm"
RPM_HASH = "a010cc3358b07166d12355758d913346afdbe4b2f4c1b30e96c3405bce4235566de12d6ffc6104c2223fe07468768d568be7ce2aad7640ab549f0a48b0fce45c"

RPROVIDES:${PN} += "fcitx-hangul fcitx5-hangul fcitx5-hangul(aarch-64) metainfo() metainfo(org.fcitx.Fcitx5.Addon.Hangul.metainfo.xml)"
RDEPENDS:${PN} += "fcitx5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFcitx5Config.so.6()(64bit) libFcitx5Core.so.7()(64bit) libFcitx5Utils.so.2()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libhangul.so.1()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
