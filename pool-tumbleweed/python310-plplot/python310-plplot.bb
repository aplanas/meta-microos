SUMMARY = "PLplot functions for scientific plotting with Python"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot's Python binding."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "python310-plplot-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "f78b158faf94da5eb5ea9d34775357f982c3761e6277ca253fbae8261ff7c06fae5b1cb30693535d865cb590affa005a8ffc220102836eed9e23cef9ba69a4da"

RPROVIDES:${PN} += "python310-plplot"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.10 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libplplot.so.17 \
libpython3.10.so.1.0 \
plplot-common \
python-abi \
python310-base \
python310-numpy"

inherit rpm
