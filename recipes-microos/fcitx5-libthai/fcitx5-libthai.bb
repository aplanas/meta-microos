SUMMARY = "Libthai input method engine for Fcitx5"
DESCRIPTION = "fcitx-libthai is an input method engine for Fcitx, which uses libthai as its backend."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.11"

RPM_NAME = "fcitx5-libthai-5.0.11-1.3.aarch64.rpm"
RPM_HASH = "59f931bf373431740a805adf8a9c901d8a6315eb6bb032ded8f65d13f64e4658739d67f07cfe7aeb80d3e8524001b5ae5f4a8a45d3e4ee2fc2dd5e369b8e900f"

RPROVIDES:${PN} += "fcitx5-libthai fcitx5-libthai(aarch-64) libthai.so()(64bit) metainfo() metainfo(org.fcitx.Fcitx5.Addon.LibThai.metainfo.xml)"
RDEPENDS:${PN} += "fcitx5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFcitx5Config.so.6()(64bit) libFcitx5Core.so.7()(64bit) libFcitx5Utils.so.2()(64bit) libc.so.6(GLIBC_2.32)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libstdc++.so.6(GLIBCXX_3.4.9)(64bit) libthai-data libthai.so.0()(64bit) libthai.so.0(LIBTHAI_0.1)(64bit) libthai.so.0(LIBTHAI_0.1.19)(64bit)"

inherit rpm
