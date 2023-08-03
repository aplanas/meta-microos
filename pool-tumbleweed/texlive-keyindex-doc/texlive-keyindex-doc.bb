SUMMARY = "Documentation for texlive-keyindex"
DESCRIPTION = "This package includes the documentation for texlive-keyindex"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn50828"

RPM_NAME = "texlive-keyindex-doc-2023.209.1.0svn50828-56.1.noarch.rpm"
RPM_HASH = "6ee5027eaf1e2318e8c39c923a7775c6f099d5037e99cfc6564ad8b07c261d524dd030239f553689a6b6ce1e4b3f6abbb8d8c31e6684846278e54d93f6aa805d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-keyindex-doc"

RDEPENDS:${PN} += ""

inherit rpm
