SUMMARY = "PLplot driver using the psttf backend"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the psttf driver for plotting using PLplot."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-driver-psttf-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "77990709a64c22227e400f89c2b44c22fcd231f16ed09d299ebb18cce0ac0fbd58d1747509c7eff76cc83dea52c11e37a93dea8ade7beb2152829c27dccc0c99"

RPROVIDES:${PN} += "plplot-driver-psttf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libLASi.so.2 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libplplot.so.17 \
libstdc++.so.6 \
plplot-common"

inherit rpm
