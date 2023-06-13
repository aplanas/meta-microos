SUMMARY = "Documentation for texlive-naive-ebnf"
DESCRIPTION = "This package includes the documentation for texlive-naive-ebnf"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.5svn66017"

RPM_NAME = "texlive-naive-ebnf-doc-2023.201.0.0.0.5svn66017-54.1.noarch.rpm"
RPM_HASH = "e662d1af8c2d4cb5ea9b5d898c48095608ad4ccad1881503b94ce83972121c143676cd52a87afb997aeed6902282932768da23ce53a211705939e762d12f184f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-naive-ebnf-doc"

RDEPENDS:${PN} += ""

inherit rpm
