SUMMARY = "Documentation for texlive-babel-romansh"
DESCRIPTION = "This package includes the documentation for texlive-babel-romansh"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn30286"

RPM_NAME = "texlive-babel-romansh-doc-2023.209.svn30286-54.1.noarch.rpm"
RPM_HASH = "52878ae2d486dcb4b9a057b69ba110f34f7573c07ff428d0e88a9a956e5268735f28b053dd72a933cb164d86e73d7be43968da4de0e92a00fbaaab4b1855c03e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-romansh-doc"

RDEPENDS:${PN} += ""

inherit rpm
