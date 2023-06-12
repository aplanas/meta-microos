SUMMARY = "Documentation for texlive-biblatex-archaeology"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-archaeology"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn53281"

RPM_NAME = "texlive-biblatex-archaeology-doc-2023.201.2.2svn53281-53.1.noarch.rpm"
RPM_HASH = "e908b0c4589f06d8d1eb8aa77cb9fb4a8d2ca5329f8f0b3c1ce32e8b8839aed8fc95234f711f283fbd4cb5f90c201ddc96f0d6446748fc3a2ea3460080fa7c8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-archaeology-doc"
RDEPENDS:${PN} += ""

inherit rpm
