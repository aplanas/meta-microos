SUMMARY = "Documentation for texlive-rescansync"
DESCRIPTION = "This package includes the documentation for texlive-rescansync"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.0svn63856"

RPM_NAME = "texlive-rescansync-doc-2023.209.0.0.0.0svn63856-54.1.noarch.rpm"
RPM_HASH = "8a997cf9b5c786c20e8aae93905a585d10ffc6cbeb84823e3c74eaf2892b0839990b010be65f0e9ed25a7b9679e31704785c3f995f9bb28f5b41d1b69985d92c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rescansync-doc"

RDEPENDS:${PN} += ""

inherit rpm
