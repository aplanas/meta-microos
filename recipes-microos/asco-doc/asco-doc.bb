SUMMARY = "Documentation for ASCO"
DESCRIPTION = "ASCO project aims to bring circuit optimization capabilities to existing SPICE \
simulators using a high-performance parallel differential evolution (DE) optimization \
algorithm. \
 \
This package provides documentation for ASCO in PDF format."
LICENSE = "GPL-2.0-only"

PV = "0.4.11"

RPM_NAME = "asco-doc-0.4.11-1.7.noarch.rpm"
RPM_HASH = "1d9fdb7c4c28c46b5e0b893731a7360622fc1fb600aacf99e55455f81447edbae1089592148a7a7c9764412788685566c22c37e2af62d189ac2c271c064e9587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "asco-doc"
RDEPENDS:${PN} += ""

inherit rpm
