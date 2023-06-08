SUMMARY = "Non-linear curve fitting and data analysis"
DESCRIPTION = "Fityk is a program for nonlinear curve-fitting of analytical \
functions (especially peak-shaped) to data (usually experimental \
data). It can also be used for visualization of x-y data only."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "fityk-1.3.2-1.4.aarch64.rpm"
RPM_HASH = "58c08aa444a9e483fe31eaf87fc1fdbc04fac67e0a037ddf40fa3ae50828bbe347e732273a41fd405b20dc1f6f756b10cf3a49fd50a1f84f6f4f7e5725ad5ece"

RPROVIDES:${PN} += "application() application(fityk.desktop) fityk fityk(aarch-64) metainfo() metainfo(fityk.appdata.xml) mimehandler(application/x-fityk)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libfityk.so.4()(64bit) libgcc_s.so.1()(64bit) libgcc_s.so.1(GCC_3.0)(64bit) libgcc_s.so.1(GCC_3.3.1)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) libm.so.6(GLIBC_2.29)(64bit) libnlopt.so.0()(64bit) libstdc++.so.6()(64bit) libstdc++.so.6(CXXABI_1.3)(64bit) libstdc++.so.6(CXXABI_1.3.8)(64bit) libstdc++.so.6(CXXABI_1.3.9)(64bit) libstdc++.so.6(GLIBCXX_3.4)(64bit) libstdc++.so.6(GLIBCXX_3.4.15)(64bit) libstdc++.so.6(GLIBCXX_3.4.20)(64bit) libstdc++.so.6(GLIBCXX_3.4.21)(64bit) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) libwx_baseu-suse.so.9.0.0()(64bit) libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_core-suse.so.9.0.0()(64bit) libwx_gtk3u_core-suse.so.9.0.0(WXU_3.2)(64bit) libwx_gtk3u_stc-suse.so.9.0.0()(64bit) libwx_gtk3u_stc-suse.so.9.0.0(WXU_3.2)(64bit) libxy.so.3()(64bit)"

inherit rpm
