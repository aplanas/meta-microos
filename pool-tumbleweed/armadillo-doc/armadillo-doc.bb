SUMMARY = "Documentation for armadillo"
DESCRIPTION = "Armadillo is a C++ linear algebra library (matrix maths). \
Integer, floating point and complex numbers are supported, \
as well as a subset of trigonometric and statistics functions. \
 \
This package provides the documentation for armadillo."
LICENSE = "Apache-2.0"

PV = "12.6.0"

RPM_NAME = "armadillo-doc-12.6.0-1.1.noarch.rpm"
RPM_HASH = "9355627f0b7816d612ebdeb2a952f1e99f1752d8358c2345f9ecd9bc0397db6f6afae6432ed019469cb09cd91ab66fd053a3c5e4aa6df4688f1f3d917846c312"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "armadillo-doc"

RDEPENDS:${PN} += ""

inherit rpm
