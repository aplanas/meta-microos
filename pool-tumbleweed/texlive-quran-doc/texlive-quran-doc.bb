SUMMARY = "Documentation for texlive-quran"
DESCRIPTION = "This package includes the documentation for texlive-quran"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.81svn57601"

RPM_NAME = "texlive-quran-doc-2023.209.1.81svn57601-54.1.noarch.rpm"
RPM_HASH = "6c3a2fd041ab907be2339113ef2559a2f86a051392c14fe6e8fecde18aadd5ad372a5eee2b8ab37a907a8ac531e8844911d8b970cb7f820b3c9e25d8f01336e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-doc"

RDEPENDS:${PN} += ""

inherit rpm
