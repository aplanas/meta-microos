SUMMARY = "Documentation for armadillo"
DESCRIPTION = "Armadillo is a C++ linear algebra library (matrix maths). \
Integer, floating point and complex numbers are supported, \
as well as a subset of trigonometric and statistics functions. \
 \
This package provides the documentation for armadillo."
LICENSE = "Apache-2.0"

PV = "12.4.1"

RPM_NAME = "armadillo-doc-12.4.1-1.1.noarch.rpm"
RPM_HASH = "488e9211c03f1086ecefc2f7294e59c6c2bf9a0a7b81f882dd01ec7146af5abd6e62f0f700cad0d992cbe8b79adc4b13aa99564457918748bcdc4571c68cb5f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "armadillo-doc"

RDEPENDS:${PN} += ""

inherit rpm
