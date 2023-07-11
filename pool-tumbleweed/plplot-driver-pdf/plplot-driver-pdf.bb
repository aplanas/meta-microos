SUMMARY = "PLplot driver using the pdf backend"
DESCRIPTION = "PLplot is a library of functions that are useful for making scientific \
plots. \
 \
This package provides the pdf driver for plotting using PLplot."
LICENSE = "LGPL-2.1-or-later"

PV = "5.15.0"

RPM_NAME = "plplot-driver-pdf-5.15.0-17.1.aarch64.rpm"
RPM_HASH = "418a9874963cf4f4b72b2035561ee9bcd495ac1be8c9ddb1ef90195de4ee3fd7a702f63c4360507e6f656b50fbdef8f544e06f33cc1e715f4abb42f54d5d2d8f"

RPROVIDES:${PN} += "plplot-driver-pdf"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhpdf.so.2 \
libm.so.6 \
libplplot.so.17 \
plplot-common"

inherit rpm
