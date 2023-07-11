SUMMARY = "API documentation for the Givaro library, in HTML"
DESCRIPTION = "Givaro is a C++ library for arithmetic and algebraic computations. \
 \
This subpackage contains the Doxygen-generated HTML documentation for \
the Givaro API."
LICENSE = "CECILL-B"

PV = "4.2.0"

RPM_NAME = "givaro-doc-4.2.0-2.2.noarch.rpm"
RPM_HASH = "b58459562afc902b371919718c5e8243e8f932be63f01b6ec4a521ef27d52d1f3b205c7d5f8707ec106077aef548e86ccf7388881b18f2e63c2435e435604544"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "givaro-doc"

RDEPENDS:${PN} += ""

inherit rpm
