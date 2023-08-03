SUMMARY = "Documentation for texlive-kixfont"
DESCRIPTION = "This package includes the documentation for texlive-kixfont"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn18488"

RPM_NAME = "texlive-kixfont-doc-2023.209.svn18488-56.1.noarch.rpm"
RPM_HASH = "c1aedd3074ed65fdf49eea4a8c2c921288db9e5c83f5a8eed388ef9d425f53cc3e39a405816ec1a921f7534c58d8c16baf03fb2948bcc1823e67af5ccb28473a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kixfont-doc"

RDEPENDS:${PN} += ""

inherit rpm
