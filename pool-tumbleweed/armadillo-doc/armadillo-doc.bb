SUMMARY = "Documentation for armadillo"
DESCRIPTION = "Armadillo is a C++ linear algebra library (matrix maths). \
Integer, floating point and complex numbers are supported, \
as well as a subset of trigonometric and statistics functions. \
 \
This package provides the documentation for armadillo."
LICENSE = "Apache-2.0"

PV = "12.6.2"

RPM_NAME = "armadillo-doc-12.6.2-1.1.noarch.rpm"
RPM_HASH = "0789384654fbc033df090300fbecb604a67b13478ee606ea2d22d056474fd172fc4d0fcdca7b9b817269b3b679754eb6400c333b85dc03f2cfcb8942d403dc47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "armadillo-doc"

RDEPENDS:${PN} += ""

inherit rpm
