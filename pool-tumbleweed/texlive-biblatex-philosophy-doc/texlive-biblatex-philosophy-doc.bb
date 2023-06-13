SUMMARY = "Documentation for texlive-biblatex-philosophy"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-philosophy"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.9.8gsvn64414"

RPM_NAME = "texlive-biblatex-philosophy-doc-2023.201.1.9.8gsvn64414-53.1.noarch.rpm"
RPM_HASH = "c00b0744bb3e6f862ab838dd5b360e23a88cb430c4e1a5685123f0283161b85eb9c1c97ec5f57294ed236c8a1cc9c4f3d514f72e4477947bfb61b22fc570aad2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-philosophy-doc"

RDEPENDS:${PN} += ""

inherit rpm
