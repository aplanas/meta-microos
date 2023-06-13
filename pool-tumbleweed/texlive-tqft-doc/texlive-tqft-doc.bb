SUMMARY = "Documentation for texlive-tqft"
DESCRIPTION = "This package includes the documentation for texlive-tqft"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn44455"

RPM_NAME = "texlive-tqft-doc-2023.201.2.1svn44455-52.1.noarch.rpm"
RPM_HASH = "8c1f93f4e67e50900037cb0364d77a2ff8189635f529ade92ab3b27f6df5b1e575fffff5442a9901cb7fe76b0ed228cfdd0502f7eb6337bf119211b717184841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tqft-doc"

RDEPENDS:${PN} += ""

inherit rpm
