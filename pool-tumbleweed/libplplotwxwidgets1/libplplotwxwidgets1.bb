SUMMARY = "PLplot functions for scientific plotting with wxWidgets"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot functions required for scientific \
plotting with wxWidgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "libplplotwxwidgets1-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "14240f0b3738de397261e294f7fde3b93d4d1ffa5237fb95d7d2cbc4ca2a497583f9a2d890326871a95df4a07aeb1dca38be002c38cd24b80e321d90a5b03482"

RPROVIDES:${PN} += "libplplotwxwidgets.so.1 \
libplplotwxwidgets1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libplplot.so.17 \
libplplotcxx.so.15 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0"

inherit rpm
