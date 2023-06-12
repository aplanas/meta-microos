SUMMARY = "Documentation for texlive-babel-romanian"
DESCRIPTION = "This package includes the documentation for texlive-babel-romanian"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2msvn58776"

RPM_NAME = "texlive-babel-romanian-doc-2023.201.1.2msvn58776-53.1.noarch.rpm"
RPM_HASH = "3ccdbf6aec24dbe4710f0061fcfe1aac7478e745c7ec9acb89cf78c0fd2616df6bb16e9a82b197a69706eea852295ca00a77f8f015a9f432713a962b703eee97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-romanian-doc"
RDEPENDS:${PN} += ""

inherit rpm
