SUMMARY = "Documentation for texlive-multidef"
DESCRIPTION = "This package includes the documentation for texlive-multidef"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn40637"

RPM_NAME = "texlive-multidef-doc-2023.201.1.10svn40637-54.1.noarch.rpm"
RPM_HASH = "16942674ddba64294e7a0802cd86fa76e922c821f68a6b10921e79f80926f24c0c81ed6ee9b1658a1345525616903d11e754db9188be5df0f12aad4cb5ff5ebb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-multidef-doc"

RDEPENDS:${PN} += ""

inherit rpm
