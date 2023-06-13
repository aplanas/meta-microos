SUMMARY = "PLplot functions for scientific plotting with wxWidgets"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot functions required for scientific \
plotting with wxWidgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "libplplotwxwidgets1-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "f585c2b38d109da9504111c471b2b98ab424ad50636a6bcd94b3b678beeabf50f21eb8bd84fd219d6a8c0ffce0f2e111d7dd44ff8c1ffe4fb05adcaf8a177ee5"

RPROVIDES:${PN} += "libplplotwxwidgets.so.1()(64bit) \
libplplotwxwidgets1 \
libplplotwxwidgets1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libplplot.so.17()(64bit) \
libplplotcxx.so.15()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse.so.9.0.0()(64bit)"

inherit rpm
