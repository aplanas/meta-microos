SUMMARY = "Documentation for texlive-xunicode"
DESCRIPTION = "This package includes the documentation for texlive-xunicode"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.981svn30466"

RPM_NAME = "texlive-xunicode-doc-2023.209.0.0.981svn30466-53.2.noarch.rpm"
RPM_HASH = "3ff30cff0df14ef5c978d8fb8cb18c2ce3ecd06cb8c16f68773e3a7ba0df5caff3f276d4cbe0a2d3d4a352ff8141acaf1f69017ac0ae3c67e769af913bb69a5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xunicode-doc"

RDEPENDS:${PN} += ""

inherit rpm
