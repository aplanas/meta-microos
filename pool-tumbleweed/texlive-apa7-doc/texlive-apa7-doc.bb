SUMMARY = "Documentation for texlive-apa7"
DESCRIPTION = "This package includes the documentation for texlive-apa7"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.16svn63974"

RPM_NAME = "texlive-apa7-doc-2023.209.2.16svn63974-55.1.noarch.rpm"
RPM_HASH = "55b009e86ba2a373e185173b215e3a1135b73779614b3e793bf092727525104c1c2d8109495ed3f30bcd197ef5aebee5cc460d02c1c16c33795649424c9ab44e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apa7-doc"

RDEPENDS:${PN} += ""

inherit rpm
