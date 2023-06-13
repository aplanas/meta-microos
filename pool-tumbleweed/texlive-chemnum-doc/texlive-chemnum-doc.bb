SUMMARY = "Documentation for texlive-chemnum"
DESCRIPTION = "This package includes the documentation for texlive-chemnum"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3asvn57490"

RPM_NAME = "texlive-chemnum-doc-2023.201.1.3asvn57490-53.1.noarch.rpm"
RPM_HASH = "bdd749a149ec1692e41fd5a7868f5f1b10d00fa5da300cd26318305a641a1c4247d0792ed84b759f780c20982618aff3ebadb0e177bac3b5d21469ad11877ebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemnum-doc"

RDEPENDS:${PN} += ""

inherit rpm
