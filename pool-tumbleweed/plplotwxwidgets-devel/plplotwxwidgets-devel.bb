SUMMARY = "PLplot bindings for development with wxWidgets"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot functions required for scientific \
plotting with wxWidgets."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplotwxwidgets-devel-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "50e025eb6cdc92514d6765ed99acc635f24058e8a8b65ccf68cbbb906629d3f3c424da3ef1a9debc0d8bcc11619a4f924fcdc84fe7da8e805fff4e19f0f3086e"

RPROVIDES:${PN} += "pkgconfig-plplot-wxwidgets \
plplot-wxwidgets-devel \
plplotwxwidgets-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libplplot.so.17 \
libplplotwxwidgets1 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
pkgconfig \
pkgconfig-plplot-c++ \
plplot-common \
plplot-devel \
wxWidgets-devel"

inherit rpm
