SUMMARY = "Documentation for texlive-cstypo"
DESCRIPTION = "This package includes the documentation for texlive-cstypo"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn41986"

RPM_NAME = "texlive-cstypo-doc-2023.209.0.0.03svn41986-55.1.noarch.rpm"
RPM_HASH = "91745520cf140792a3fe1cdc6e21fa2c413bce86442a319d7399b1dc0bb5dafc5e7418fd72aef9f4a5fb4c889ea3b266517a0440b24442aec1768a138bdc4b4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cstypo-doc"

RDEPENDS:${PN} += ""

inherit rpm
