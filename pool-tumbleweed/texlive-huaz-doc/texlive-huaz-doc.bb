SUMMARY = "Documentation for texlive-huaz"
DESCRIPTION = "This package includes the documentation for texlive-huaz"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn64723"

RPM_NAME = "texlive-huaz-doc-2023.208.1.0svn64723-53.1.noarch.rpm"
RPM_HASH = "11bb79a6de5d1763469e0287ea8aca723c4bb2d8716af8c9f7cc3d363df3bc8233c49f2deb1e71791e17c28ecc7b6962c5b34cbee515a0e0f1cd4de1c457cc74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-huaz-doc-hu \
texlive-huaz-doc"

RDEPENDS:${PN} += ""

inherit rpm
