SUMMARY = "PLplot functions for scientific plotting with Qt"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot functions required for scientific \
plotting with Qt."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "libplplotqt2-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "8423d350fd581a342dbd83d43c227e91f5eb132d0ce663fc26bc871dc98dc499acb14ada35e3b2df2ff5e1851daf47585aa20dd9ef7f4ebc878d2257c3efc94f"

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
