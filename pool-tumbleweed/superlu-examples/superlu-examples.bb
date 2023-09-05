SUMMARY = "Examples for superlu"
DESCRIPTION = "Example programs for SuperLU. \
SuperLU is an algorithm that uses group theory to optimize LU \
decomposition of sparse matrices."
LICENSE = "BSD-3-Clause"

PV = "6.0.1"

RPM_NAME = "superlu-examples-6.0.1-1.1.noarch.rpm"
RPM_HASH = "7f6df37075dcee892e6c0e84877a36cd746d3e97a6d0b2d7848d6abea434ed8a2b793049f810d3a226bd2c2e5ff6c939ec20fdd9acf62cf77929bf2a9506f7cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "superlu-examples"

RDEPENDS:${PN} += ""

inherit rpm
