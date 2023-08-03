SUMMARY = "Documentation for texlive-beamertheme-epyt"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-epyt"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn41404"

RPM_NAME = "texlive-beamertheme-epyt-doc-2023.209.1.0svn41404-54.1.noarch.rpm"
RPM_HASH = "663e4af8e4c4468ccc3dedc5dba58da8bd7520efc44e3326d3048ba13fcba0ee0aecc3dd4f4ada44f3e7adce6f02389644cad10f4cc455d6b5f9cb87ee353589"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-beamertheme-epyt-doc-zh \
texlive-beamertheme-epyt-doc"

RDEPENDS:${PN} += ""

inherit rpm
