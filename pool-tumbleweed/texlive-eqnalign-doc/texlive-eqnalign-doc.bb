SUMMARY = "Documentation for texlive-eqnalign"
DESCRIPTION = "This package includes the documentation for texlive-eqnalign"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0asvn43278"

RPM_NAME = "texlive-eqnalign-doc-2023.201.1.0asvn43278-53.1.noarch.rpm"
RPM_HASH = "3a4b2e727bc81f560409ca642ae87a305debb0339ac4c8b5fba2d47e78a07ca3cb4e2398209d9dc4ac1f068385676b1f5ce5ef93c2774e7573ce877bbfe0311c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqnalign-doc"
RDEPENDS:${PN} += ""

inherit rpm
