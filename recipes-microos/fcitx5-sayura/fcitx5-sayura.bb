SUMMARY = "Sinhala input method for Fcitx5"
DESCRIPTION = "Fcitx5-Sayura is a Sinhala input method for Fcitx5 input method framework ported from IBus-Sayura."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.6"

RPM_NAME = "fcitx5-sayura-5.0.6-1.7.aarch64.rpm"
RPM_HASH = "6e9e9baf079e801727e3d37d80e1e7c7000b9598222894e4f4673d89fd0cfa7a0feb5ec61e3f919f3194ccd61e42f722ef22d5c0338ba375e5892a073962cc68"

RPROVIDES:${PN} += "fcitx-sayura fcitx5-sayura fcitx5-sayura(aarch-64) metainfo() metainfo(org.fcitx.Fcitx5.Addon.Sayura.metainfo.xml)"
RDEPENDS:${PN} += "fcitx5 ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libFcitx5Core.so.7()(64bit) libFcitx5Utils.so.2()(64bit) libc.so.6(GLIBC_2.17)(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit)"

inherit rpm
