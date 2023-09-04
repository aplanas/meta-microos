SUMMARY = "Documentation for texlive-edmargin"
DESCRIPTION = "This package includes the documentation for texlive-edmargin"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn27599"

RPM_NAME = "texlive-edmargin-doc-2023.209.1.2svn27599-54.2.noarch.rpm"
RPM_HASH = "fe10ea070c7e5ecc30633dd2b0851d860e944781c8377f0a6f5f1a5d391deee5beaa169272bc1ce9cba4b2eb1de253b6e8785bedde2b7be1d5cf257d37b46d23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-edmargin-doc"

RDEPENDS:${PN} += ""

inherit rpm
