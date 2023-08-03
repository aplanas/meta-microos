SUMMARY = "Documentation for texlive-dictsym"
DESCRIPTION = "This package includes the documentation for texlive-dictsym"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn20031"

RPM_NAME = "texlive-dictsym-doc-2023.209.svn20031-53.1.noarch.rpm"
RPM_HASH = "85ae0ebd489bdfcd9b8bfb8bd8bba8dc96c2c6700651cd9ced171d12558ac3edef1aa1f4700ecc18328d3ebdbe8d15588e9c7c5c8741554bc0efcf2db825cc5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dictsym-doc"

RDEPENDS:${PN} += ""

inherit rpm
