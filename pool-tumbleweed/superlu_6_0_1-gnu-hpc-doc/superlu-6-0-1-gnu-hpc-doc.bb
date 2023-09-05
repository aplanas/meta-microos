SUMMARY = "Documentation for superlu_6_0_1-gnu-hpc"
DESCRIPTION = "Documentation (HTML/PDF) for SuperLU. \
SuperLU is an algorithm that uses group theory to optimize LU \
decomposition of sparse matrices."
LICENSE = "BSD-3-Clause"

PV = "6.0.1"

RPM_NAME = "superlu_6_0_1-gnu-hpc-doc-6.0.1-1.1.noarch.rpm"
RPM_HASH = "bc546c14671777d4c8402c60864f28aefa1eeb45638623d9518168f8aed968ae69eebc90d30b537f4374d6812b1803e7e11a86a810a4a9c5b1e1bfac2a399d61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "superlu-6-0-1-gnu-hpc-doc"

RDEPENDS:${PN} += ""

inherit rpm
