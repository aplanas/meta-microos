SUMMARY = "API documentation for the Givaro library, in HTML"
DESCRIPTION = "Givaro is a C++ library for arithmetic and algebraic computations. \
 \
This subpackage contains the Doxygen-generated HTML documentation for \
the Givaro API."
LICENSE = "CECILL-B"

PV = "4.2.0"

RPM_NAME = "givaro-doc-4.2.0-2.1.noarch.rpm"
RPM_HASH = "c832d2d9377321c0e523b20b250bd564bb227fe1b24caa862dc8cbcd8ea095970135e3b7a73662a2992526707ee05729d6f2c9a6648b9895ea373122be19e06b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "givaro-doc"

RDEPENDS:${PN} += ""

inherit rpm
