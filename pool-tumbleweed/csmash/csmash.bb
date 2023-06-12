SUMMARY = "3D Table Tennis Game"
DESCRIPTION = "CannonSmash is a 3D table tennis game. The goal of this project is to \
represent various table tennis strategies in a computer game."
LICENSE = "GPL-2.0-or-later"

PV = "0.6.6"

RPM_NAME = "csmash-0.6.6-274.5.aarch64.rpm"
RPM_HASH = "38edc7161905d3e758d1fc9f1d24631f75f99f2358a3954885920e095949246a63c2cd0ae4e0ac63f4fc40cb6ddee8149292d6a2d29313b35768162e92799f38"

RPROVIDES:${PN} += "application() \
application(csmash.desktop) \
csmash \
csmash(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libSDL_image-1.2.so.0()(64bit) \
libSDL_mixer-1.2.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libglib-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libz.so.1()(64bit)"

inherit rpm
