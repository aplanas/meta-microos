SUMMARY = "Documentation for texlive-basicarith"
DESCRIPTION = "This package includes the documentation for texlive-basicarith"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn35460"

RPM_NAME = "texlive-basicarith-doc-2023.201.1.1svn35460-53.1.noarch.rpm"
RPM_HASH = "171d5e5b77f515bb684f29da3f3e30e92a9a1a820a6c390c97d4e91ed7fe30a5cbb61cd25396423532000816b6a29d56b6cc45aa80d1cf7f2bde650c8fcb20ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-basicarith-doc"

RDEPENDS:${PN} += ""

inherit rpm
