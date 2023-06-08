SUMMARY = "Chewing Wrapper for Fcitx5"
DESCRIPTION = "Chewing Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.13"

RPM_NAME = "fcitx5-chewing-5.0.13-1.3.aarch64.rpm"
RPM_HASH = "0c4101f6f7a8897b2073c6b9295a0762b6891a906e1a746a0065e71d15732ab4c2682dccf278e713d6a0c0afd84966fcdfceba3617f58d3a8091730ebdbd0c77"

RPROVIDES:${PN} += "fcitx-chewing fcitx5-chewing fcitx5-chewing(aarch-64) libchewing.so()(64bit) metainfo() metainfo(org.fcitx.Fcitx5.Addon.Chewing.metainfo.xml)"
RDEPENDS:${PN} += "chewing-data chewing-utils fcitx5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFcitx5Config.so.6()(64bit) libFcitx5Core.so.7()(64bit) libFcitx5Utils.so.2()(64bit) libc.so.6(GLIBC_2.32)(64bit) libchewing.so.3()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
