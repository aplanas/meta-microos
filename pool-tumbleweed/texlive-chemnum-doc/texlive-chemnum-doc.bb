SUMMARY = "Documentation for texlive-chemnum"
DESCRIPTION = "This package includes the documentation for texlive-chemnum"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3asvn57490"

RPM_NAME = "texlive-chemnum-doc-2023.209.1.3asvn57490-54.1.noarch.rpm"
RPM_HASH = "23c2d686eef628a2f09d5093a36b76391bc041427847ec532667e090adc943ebadea70dcd68c81c4786db44d0b556007c6918f3ed0ccaadf4eb9a94baf15ebda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemnum-doc"

RDEPENDS:${PN} += ""

inherit rpm
