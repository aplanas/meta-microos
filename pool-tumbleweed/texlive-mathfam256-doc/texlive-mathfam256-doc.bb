SUMMARY = "Documentation for texlive-mathfam256"
DESCRIPTION = "This package includes the documentation for texlive-mathfam256"
LICENSE = "BSD-3-Clause"

PV = "2023.208.0.0.5svn53519"

RPM_NAME = "texlive-mathfam256-doc-2023.208.0.0.5svn53519-53.1.noarch.rpm"
RPM_HASH = "cd702652531e10f9370c373f84616333d8f4eb40af379e87134aaab3c028bd557cbc95e12939966ec00fd1102173c14c00c7a160ff517ad4af826f4c0907f666"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathfam256-doc"

RDEPENDS:${PN} += ""

inherit rpm
