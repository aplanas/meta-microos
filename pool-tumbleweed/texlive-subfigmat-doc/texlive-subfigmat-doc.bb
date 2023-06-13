SUMMARY = "Documentation for texlive-subfigmat"
DESCRIPTION = "This package includes the documentation for texlive-subfigmat"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn20308"

RPM_NAME = "texlive-subfigmat-doc-2023.201.1.0svn20308-57.1.noarch.rpm"
RPM_HASH = "8c2a66ed2c96bc3b82e20b443eee1d914fe5d29b0952253ad3c81586e379a75ab97be07d3c6de23cb8d264758be2edfb1978582c6494a4a21337de1dad1aabf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-subfigmat-doc"

RDEPENDS:${PN} += ""

inherit rpm
