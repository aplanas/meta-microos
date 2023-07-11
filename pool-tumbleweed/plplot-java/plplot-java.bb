SUMMARY = "PLplot functions for scientific plotting with Java"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot functions required for scientific \
plotting with Java."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-java-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "de265580a9722a178010335dc72741a19df433b656857a367a3bdc3ea4c99bc15a571e51ab11b81ec64dfe71ae8b006b83e112ae37000cc4584cb580393ae1cd"

RPROVIDES:${PN} += "libplplotjavac-wrap.so \
plplot-java"

RDEPENDS:${PN} += "/usr/bin/bash \
java \
ld-linux-aarch64.so.1 \
libc.so.6 \
libplplot.so.17 \
plplot-common"

inherit rpm
