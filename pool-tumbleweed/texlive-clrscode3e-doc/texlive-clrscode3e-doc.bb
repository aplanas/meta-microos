SUMMARY = "Documentation for texlive-clrscode3e"
DESCRIPTION = "This package includes the documentation for texlive-clrscode3e"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn51137"

RPM_NAME = "texlive-clrscode3e-doc-2023.209.svn51137-54.1.noarch.rpm"
RPM_HASH = "4b88eb64da38276fa723dcbb54185b7fce7620e8bc70fe7619a2218eb632557dfd69ce7e4943b1e58d10634cbe8b674e785b198b628f8b0a46075ea129a41cd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clrscode3e-doc"

RDEPENDS:${PN} += ""

inherit rpm
