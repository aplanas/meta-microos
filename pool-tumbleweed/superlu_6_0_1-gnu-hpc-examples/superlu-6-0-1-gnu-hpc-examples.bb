SUMMARY = "Examples for superlu_6_0_1-gnu-hpc"
DESCRIPTION = "Example programs for SuperLU. \
SuperLU is an algorithm that uses group theory to optimize LU \
decomposition of sparse matrices."
LICENSE = "BSD-3-Clause"

PV = "6.0.1"

RPM_NAME = "superlu_6_0_1-gnu-hpc-examples-6.0.1-1.1.noarch.rpm"
RPM_HASH = "95d05b92c42320c064ea639ef07746d8afe8bd9bea8fdd644220269e5a82f6e8d682dd8addcc06954a61cd34619b0c8528d21b17ccd43ce8d9bd7c0dbc9e94e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "superlu-6-0-1-gnu-hpc-examples"

RDEPENDS:${PN} += ""

inherit rpm
