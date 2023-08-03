SUMMARY = "Documentation for texlive-cantarell"
DESCRIPTION = "This package includes the documentation for texlive-cantarell"
LICENSE = "OFL-1.1"

PV = "2023.209.3.2svn54512"

RPM_NAME = "texlive-cantarell-doc-2023.209.3.2svn54512-53.1.noarch.rpm"
RPM_HASH = "4a58a7caddffd9512c67851c3ed23499e5f467be4cb9af5b88d721eaa9d76c6da8b33a77ccc11057429e09f170fd649262e1a2a6ee3f057da5beb3e60addcc06"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cantarell-doc"

RDEPENDS:${PN} += ""

inherit rpm
