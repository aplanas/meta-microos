SUMMARY = "Documentation for texlive-turnthepage"
DESCRIPTION = "This package includes the documentation for texlive-turnthepage"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3asvn29803"

RPM_NAME = "texlive-turnthepage-doc-2023.201.1.3asvn29803-52.1.noarch.rpm"
RPM_HASH = "efd746eaa994d8fe6a0e3be635c68093e7cf74df08cbf851f1352a679aa6875a46e07a4ed52be986e24d902c551c3726df73432300a6a780033401e9da48e46f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-turnthepage-doc"
RDEPENDS:${PN} += ""

inherit rpm
