SUMMARY = "Documentation for texlive-graphviz"
DESCRIPTION = "This package includes the documentation for texlive-graphviz"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.94svn31517"

RPM_NAME = "texlive-graphviz-doc-2023.209.0.0.94svn31517-54.2.noarch.rpm"
RPM_HASH = "032906c6210dfc0a8924df2bef2800558b541e8f547fcd05ff1e6e7cf868ba6c061b7f1ada322d1f10e1865f156277d7020e73a612972789b82ab976c2860f3c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphviz-doc"

RDEPENDS:${PN} += ""

inherit rpm
