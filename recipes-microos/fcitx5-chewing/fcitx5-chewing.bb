SUMMARY = "Chewing Wrapper for Fcitx5"
DESCRIPTION = "Chewing Wrapper for Fcitx5."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.14"

RPM_NAME = "fcitx5-chewing-5.0.14-1.1.aarch64.rpm"
RPM_HASH = "b821fc76e4e217067d18bf9e3e3c06d32860e7139bf1d9d3a7b7711f2ea7d92b066f0980583af35d4f7a24d4a4f830c6f51113bc557d9559a1de9ecd8d52eb94"

RPROVIDES:${PN} += "fcitx-chewing \
fcitx5-chewing \
fcitx5-chewing(aarch-64) \
libchewing.so()(64bit) \
metainfo() \
metainfo(org.fcitx.Fcitx5.Addon.Chewing.metainfo.xml)"
RDEPENDS:${PN} += "chewing-data \
chewing-utils \
fcitx5 \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libFcitx5Config.so.6()(64bit) \
libFcitx5Core.so.7()(64bit) \
libFcitx5Utils.so.2()(64bit) \
libc.so.6(GLIBC_2.32)(64bit) \
libchewing.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit)"

inherit rpm
