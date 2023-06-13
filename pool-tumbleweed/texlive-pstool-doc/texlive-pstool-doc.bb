SUMMARY = "Documentation for texlive-pstool"
DESCRIPTION = "This package includes the documentation for texlive-pstool"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5esvn46393"

RPM_NAME = "texlive-pstool-doc-2023.201.1.5esvn46393-53.1.noarch.rpm"
RPM_HASH = "7a84c3cd107d0ee6c16dcd0e5352c23df58af33348e8b1028dc2739a47c7d4c47c3061c04525b8beed4aa32abb42cd3f34410d72e93312703cb1e6b9225fc777"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstool-doc"

RDEPENDS:${PN} += ""

inherit rpm
