SUMMARY = "PLplot functions for scientific plotting with C++"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the shared lib for PLplot's C++ binding."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplotcxx-devel-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "e6192a9125735493e1a384955b1897abff4c02044c8faa85b8575755ac1e675f376acf0b5bdb92646c9bfc2da7297fb6b2d15439d1688fab5bf98d557403ad0c"

RPROVIDES:${PN} += "pkgconfig-plplot-c++ \
plplotcxx-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplplotcxx15 \
pkgconfig-plplot \
plplot-common"

inherit rpm
