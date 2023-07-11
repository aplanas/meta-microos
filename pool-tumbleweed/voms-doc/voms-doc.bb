SUMMARY = "Virtual Organization Membership Service Documentation"
DESCRIPTION = "Documentation for the Virtual Organization Membership Service APIs."
LICENSE = "Apache-2.0"

PV = "2.1.0~rc3"

RPM_NAME = "voms-doc-2.1.0~rc3-1.4.noarch.rpm"
RPM_HASH = "8a581b114768abc9f96e07542827370bf1785842b42abc1dd403a0e97f0b22b265bb10fb13e52bedbb8e0cbea209ea70403527e543ae42599ba0706ebf4a5b56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "voms-doc"

RDEPENDS:${PN} += ""

inherit rpm
