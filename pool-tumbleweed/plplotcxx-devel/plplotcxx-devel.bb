SUMMARY = "PLplot functions for scientific plotting with C++"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the shared lib for PLplot's C++ binding."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplotcxx-devel-5.15.0-16.2.aarch64.rpm"
RPM_HASH = "0732b16ffe2c94b4e8c592f62247108b97d6cb6a18966a505e2a80bf6edfac96f0c7449d2f1edd7a5f9e9dc65e7a80f0ddf66ce458231e7542034bd852f86456"

RPROVIDES:${PN} += "pkgconfig(plplot-c++) \
plplotcxx-devel \
plplotcxx-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplplotcxx15 \
pkgconfig(plplot) \
plplot-common"

inherit rpm
