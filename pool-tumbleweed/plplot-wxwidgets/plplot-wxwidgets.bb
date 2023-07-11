SUMMARY = "PLplot plot viewer built on wxWidgets"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides a PLplot viewer built using the wxWidgets GUI API."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-wxwidgets-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "ad89e7b17143d138d2f16d3701756736777522113496bde7e5e9d40f833ba49dcb1d5ba2cc52a01ad5894ad8ee04fea77d81a9851fbf4352c6296043b4de5af2"

RPROVIDES:${PN} += "plplot-wxwidgets"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libplplotcxx.so.15 \
libplplotwxwidgets.so.1 \
libplplotwxwidgets1 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk3u-core-suse.so.9.0.0 \
plplot-common"

inherit rpm
