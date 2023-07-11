SUMMARY = "Suite of nonlinear solvers (documentation)"
DESCRIPTION = "SUNDIALS is a SUite of Non-linear DIfferential/ALgebraic equation Solvers \
for use in writing mathematical software. \
 \
This package contains the documentation files"
LICENSE = "BSD-3-Clause"

PV = "6.3.0"

RPM_NAME = "sundials-doc-6.3.0-2.5.noarch.rpm"
RPM_HASH = "3e9b0887dac9d1c71954f9cf84ff7ac7058304a17acd8d7ec1c4d245d24d41c302dbae87d81d50908ca0f0d19a54d4a510843d15e9ccc125b111acdf500ba4c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sundials-doc"

RDEPENDS:${PN} += ""

inherit rpm
