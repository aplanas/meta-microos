SUMMARY = "Documentation for texlive-gzt"
DESCRIPTION = "This package includes the documentation for texlive-gzt"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.3svn63591"

RPM_NAME = "texlive-gzt-doc-2023.201.1.1.3svn63591-53.1.noarch.rpm"
RPM_HASH = "8ad46b0f9833bcb72fcace397d6fab71cfa7137cec2b0264eeca039b84ae372f34f98259bb09974d963cba860291fb86eba362a50e0b906412c92af90bd31de8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gzt-doc-fr \
texlive-gzt-doc"

RDEPENDS:${PN} += ""

inherit rpm
