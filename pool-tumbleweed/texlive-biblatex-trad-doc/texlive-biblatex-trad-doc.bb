SUMMARY = "Documentation for texlive-biblatex-trad"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-trad"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn58169"

RPM_NAME = "texlive-biblatex-trad-doc-2023.201.0.0.5svn58169-53.1.noarch.rpm"
RPM_HASH = "fe7a8d0f0fb2d5a81d5eee2ee870c72aa65c34da4d18c80409775f9ac7ed1a4588d5a29a24b4c7e249b8212d83b11d0e9a74860aae1941f60f63f2392598426c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-trad-doc"
RDEPENDS:${PN} += ""

inherit rpm
