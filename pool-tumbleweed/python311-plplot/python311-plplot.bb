SUMMARY = "PLplot functions for scientific plotting with Python"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the PLplot's Python binding."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "python311-plplot-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "fc2a251727cf09517a40e8e8f2a5c0f1083a5518ec389c26c8e5ee5af1ab33ae4ffaaf756e5aa4b30074a16a9284a5dea3cf1751434347db22c508ae13e3c6d0"

RPROVIDES:${PN} += "python3-plplot \
python311-plplot"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/python3.11 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libplplot.so.17 \
libpython3.11.so.1.0 \
plplot-common \
python-abi \
python311-base \
python311-numpy"

inherit rpm
