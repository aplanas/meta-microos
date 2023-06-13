SUMMARY = "PLplot bindings for development with wxWidgets"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot functions required for scientific \
plotting with wxWidgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplotwxwidgets-devel-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "ea5a5f841f8d252b7664d15ca0888a5bf74e39bf3f1589a4e66b53810356efe60fdf0c63a8663b6132c07e8e7919cc828059fba49405a09b5efa66996e0466d3"

RPROVIDES:${PN} += "pkgconfig(plplot-wxwidgets) \
plplot-wxwidgets-devel \
plplotwxwidgets-devel \
plplotwxwidgets-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libplplot.so.17()(64bit) \
libplplotwxwidgets1 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0(WXU_3.2)(64bit) \
pkgconfig \
pkgconfig(plplot-c++) \
plplot-common \
plplot-devel \
wxWidgets-devel"

inherit rpm
