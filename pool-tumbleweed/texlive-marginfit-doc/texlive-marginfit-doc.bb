SUMMARY = "Documentation for texlive-marginfit"
DESCRIPTION = "This package includes the documentation for texlive-marginfit"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48281"

RPM_NAME = "texlive-marginfit-doc-2023.201.1.1svn48281-52.1.noarch.rpm"
RPM_HASH = "619f100f9c091297671055521c40369f2f8d8d82a2fe56ae969405290872172a3682bb3dc7fbc30ab629ffec905c0d9ebe499b474713ca9c644c914e0afd45e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-marginfit-doc"

RDEPENDS:${PN} += ""

inherit rpm
