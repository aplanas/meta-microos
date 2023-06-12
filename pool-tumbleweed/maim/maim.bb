SUMMARY = "Flexible screenshotting utility"
DESCRIPTION = "maim (Make Image) is a utility that takes screenshots of the desktop \
using EGL. It is meant to overcome shortcomings of the 'scrot' \
utility and performs better in several ways."
LICENSE = "GPL-3.0-or-later"

PV = "5.7.4"

RPM_NAME = "maim-5.7.4-1.14.aarch64.rpm"
RPM_HASH = "184c5fe387ab24bc7e4f85f0fb14b2e18323399759cd0656d672ed33cb23cf91df3c8530c1292cf568682938bafe912fda0b084bca4f20b7f9bd2b9c217ce13f"

RPROVIDES:${PN} += "maim \
maim(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXrandr.so.2()(64bit) \
libXrender.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libicuuc.so.73()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libslopy.so.7.6()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.5)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.11)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.14)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.32)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.9)(64bit) \
libwebp.so.7()(64bit)"

inherit rpm
