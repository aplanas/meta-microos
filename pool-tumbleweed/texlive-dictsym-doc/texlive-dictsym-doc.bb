SUMMARY = "Documentation for texlive-dictsym"
DESCRIPTION = "This package includes the documentation for texlive-dictsym"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn20031"

RPM_NAME = "texlive-dictsym-doc-2023.201.svn20031-52.1.noarch.rpm"
RPM_HASH = "903d256a8f08df55ed6fda4608a7ff8f1366c4d46f291c9713afcefd1efde3b294117845ce8b815ada1b783c58d5befb55c8a643af053bd2e62274cc6b81d9dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dictsym-doc"
RDEPENDS:${PN} += ""

inherit rpm
