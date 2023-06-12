SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_core-suse3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "ea56caefbd9d5d096323946d9129c805a9b1a38265306b360a4ed464ad2d0a0a542decebd19c119cf2b368be6447eb259c54ca82fbc1ce6e0612a072b22c9e84"

RPROVIDES:${PN} += "libwx_gtk2u_core-suse.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0)(64bit) \
libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0.1)(64bit) \
libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0.2)(64bit) \
libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0.3)(64bit) \
libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0.4)(64bit) \
libwx_gtk2u_core-suse.so.3.0.5(WXU_3.0.5)(64bit) \
libwx_gtk2u_core-suse3_0_5 \
libwx_gtk2u_core-suse3_0_5(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.18)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.20)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.29)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
libwx_baseu-suse.so.3.0.5()(64bit) \
libwx_baseu-suse.so.3.0.5(WXU_3.0)(64bit)"

inherit rpm