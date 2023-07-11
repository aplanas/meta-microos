SUMMARY = "Documentation for texlive-lualatex-truncate"
DESCRIPTION = "This package includes the documentation for texlive-lualatex-truncate"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn48469"

RPM_NAME = "texlive-lualatex-truncate-doc-2023.208.1.1svn48469-53.1.noarch.rpm"
RPM_HASH = "44110d57dab9ba1595fb99c3ae51170969c7d5e3617d9ed538cf2b15e8d3d4be922bc0aa46ca7e959cfba9f70e63f4099d32b9e2a79cad38ff4a77864a7a8aa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lualatex-truncate-doc"

RDEPENDS:${PN} += ""

inherit rpm
