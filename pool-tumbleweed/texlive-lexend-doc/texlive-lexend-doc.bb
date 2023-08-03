SUMMARY = "Documentation for texlive-lexend"
DESCRIPTION = "This package includes the documentation for texlive-lexend"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0.70svn57564"

RPM_NAME = "texlive-lexend-doc-2023.209.1.1.0.70svn57564-55.1.noarch.rpm"
RPM_HASH = "a0a0e84c69a090dcaf25dc5d082f9f3821b100c5ad133a9faaeef701b8b012ee6ff7b45b3afc3c5f8f23ed1dd5c0a15fd5911ea00b40f2eb64b57ea768fdb5a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lexend-doc"

RDEPENDS:${PN} += ""

inherit rpm
