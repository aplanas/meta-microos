SUMMARY = "PLplot driver using the psttf backend"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the psttf driver for plotting using PLplot."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-driver-psttf-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "9eb1bff02941019c4aa8104be8f788c39fff0a1d4b5dc9734a7771d1814cae4f4022be5b7df323365f81703c5055ca79cab2808a29d02bad58fd85006268b91c"

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
