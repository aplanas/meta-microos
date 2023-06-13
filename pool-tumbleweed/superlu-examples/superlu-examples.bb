SUMMARY = "Examples for superlu"
DESCRIPTION = "Example programs for SuperLU. \
SuperLU is an algorithm that uses group theory to optimize LU \
decomposition of sparse matrices."
LICENSE = "BSD-3-Clause"

PV = "6.0.0"

RPM_NAME = "superlu-examples-6.0.0-2.1.noarch.rpm"
RPM_HASH = "2d7302452aecadfdbd2916361caa693906a68b3ecc6bb21eeb7892255a6757445b2888c9bfac9b5977222f7a7a5f53c4b8bc76b0b042cbe1aad8783015b40763"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "superlu-examples"

RDEPENDS:${PN} += ""

inherit rpm
