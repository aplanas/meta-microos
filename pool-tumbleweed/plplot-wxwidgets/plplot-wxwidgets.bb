SUMMARY = "PLplot plot viewer built on wxWidgets"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides a PLplot viewer built using the wxWidgets GUI API."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-wxwidgets-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "542a62e0182f79dc8ca5ac7756c8b2a5db894b38863adeecea129649b5c3dc80d395123090e36ab5a5cb50030911d83567b24fd7e5dd31d1efc8bddebeda4ba0"

RPROVIDES:${PN} += "plplot-wxwidgets \
plplot-wxwidgets(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libplplotcxx.so.15()(64bit) \
libplplotwxwidgets.so.1()(64bit) \
libplplotwxwidgets1 \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_baseu-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0(WXU_3.2)(64bit) \
plplot-common"

inherit rpm
