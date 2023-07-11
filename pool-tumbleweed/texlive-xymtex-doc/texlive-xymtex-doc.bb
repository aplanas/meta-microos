SUMMARY = "Documentation for texlive-xymtex"
DESCRIPTION = "This package includes the documentation for texlive-xymtex"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.06svn32182"

RPM_NAME = "texlive-xymtex-doc-2023.201.5.06svn32182-52.2.noarch.rpm"
RPM_HASH = "269520657f6ce426a0aaaf848b2511f82f2dd2a3518d8f0f5539075e2ec59a16cf925793da3aa2a1490f7923e172288d90eda7551bcfb4c869db26c491b342df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xymtex-doc-ja \
texlive-xymtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
