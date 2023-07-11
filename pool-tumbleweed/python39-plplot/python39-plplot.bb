SUMMARY = "PLplot functions for scientific plotting with Python"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot's Python binding."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "python39-plplot-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "1692a5087628599f727d9f400104ec9a9852e305c8231ace655c7ffba2a0208fc38e24a04de617f1341ab42bb9efb1389eb09c30b8f9beb6fde5d2fa20d6fc92"

RPROVIDES:${PN} += "python39-plplot"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.9 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libplplot.so.17 \
libpython3.9.so.1.0 \
plplot-common \
python-abi \
python39-base \
python39-numpy"

inherit rpm
