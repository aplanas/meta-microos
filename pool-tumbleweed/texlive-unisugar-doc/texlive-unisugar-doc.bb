SUMMARY = "Documentation for texlive-unisugar"
DESCRIPTION = "This package includes the documentation for texlive-unisugar"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.92svn22357"

RPM_NAME = "texlive-unisugar-doc-2023.209.0.0.92svn22357-54.1.noarch.rpm"
RPM_HASH = "781255f071143be4ea8be9ebab0b5c23307b0b7c672bd2ed5827c524d44af05c6577ea70d937857bd40d8a7c15d1c0b15b38415b7e25eb06ca48c16539f97421"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unisugar-doc"

RDEPENDS:${PN} += ""

inherit rpm
