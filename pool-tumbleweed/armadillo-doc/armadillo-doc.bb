SUMMARY = "Documentation for armadillo"
DESCRIPTION = "Armadillo is a C++ linear algebra library (matrix maths). \
Integer, floating point and complex numbers are supported, \
as well as a subset of trigonometric and statistics functions. \
 \
This package provides the documentation for armadillo."
LICENSE = "Apache-2.0"

PV = "12.6.1"

RPM_NAME = "armadillo-doc-12.6.1-1.1.noarch.rpm"
RPM_HASH = "5322e82d82a5d16be484e6d149f4dc9c3c2271b30dfc3a2f3269cd71b0e7a1cb83b116f2e4b47b7df8349210bc8dedd6a1e9857d50264d3c438794544e1296b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "armadillo-doc"

RDEPENDS:${PN} += ""

inherit rpm
