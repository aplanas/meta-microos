SUMMARY = "Documentation for armadillo"
DESCRIPTION = "Armadillo is a C++ linear algebra library (matrix maths). \
Integer, floating point and complex numbers are supported, \
as well as a subset of trigonometric and statistics functions. \
 \
This package provides the documentation for armadillo."
LICENSE = "Apache-2.0"

PV = "12.2.0"

RPM_NAME = "armadillo-doc-12.2.0-1.1.noarch.rpm"
RPM_HASH = "76abb0ac08fa89eacbed38b399971c6af2b89fea1d1593d2fa7c5fd5edbc0560124bc0e408b5ede595deaa20559b1605bba2f0e56dcace1cead9ee8cc7309bab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "armadillo-doc"
RDEPENDS:${PN} += ""

inherit rpm
