SUMMARY = "Documentation for texlive-dpcircling"
DESCRIPTION = "This package includes the documentation for texlive-dpcircling"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54994"

RPM_NAME = "texlive-dpcircling-doc-2023.209.1.0svn54994-53.1.noarch.rpm"
RPM_HASH = "90a091b1c493f71ed3375684da9e82402e4ac8ef3b6db91128ac1e50c5c2aa0e4bb6c34035d43c3cd08451a681d85130ecd1de7c2907c07111f27c30000cddcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dpcircling-doc"

RDEPENDS:${PN} += ""

inherit rpm
