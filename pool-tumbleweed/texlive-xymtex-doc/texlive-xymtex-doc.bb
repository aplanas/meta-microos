SUMMARY = "Documentation for texlive-xymtex"
DESCRIPTION = "This package includes the documentation for texlive-xymtex"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.06svn32182"

RPM_NAME = "texlive-xymtex-doc-2023.209.5.06svn32182-53.1.noarch.rpm"
RPM_HASH = "c8b18e9974e4efa619062c20efa247f11f414a60233fc16eecfc0b177f10ead75d7d31d7a6f20c36d049df174184ce7fe56658ab51f1c32c166a8ed93c8d431d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xymtex-doc-ja \
texlive-xymtex-doc"

RDEPENDS:${PN} += ""

inherit rpm
