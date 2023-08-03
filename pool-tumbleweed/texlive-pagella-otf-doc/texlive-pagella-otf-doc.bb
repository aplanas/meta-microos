SUMMARY = "Documentation for texlive-pagella-otf"
DESCRIPTION = "This package includes the documentation for texlive-pagella-otf"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.02svn64705"

RPM_NAME = "texlive-pagella-otf-doc-2023.209.0.0.02svn64705-52.1.noarch.rpm"
RPM_HASH = "fa78c05c8141af88ce2878d1954aed04a9303d4835abdd116c53159499cef8c0feccf3fdb6d8c6a24939990de77f6a443ae9e21e4ece8f7c0b3028384f7b1afe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pagella-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
