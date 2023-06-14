SUMMARY = "PLplot functions for scientific plotting with Qt"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot functions required for scientific \
plotting with Qt."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "libplplotqt2-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "1bb98c98f8ee7d9427905fba033cace6e47728a83bf4a49d038dd02e3181e495edce6d611346e4dbf0904def3c80c1d663bb1b00915cfb3c9e3ddd74a9f810e5"

RPROVIDES:${PN} += "libplplotqt.so.2 \
libplplotqt2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5PrintSupport.so.5 \
libQt5Svg.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libplplot.so.17 \
libstdc++.so.6"

inherit rpm
