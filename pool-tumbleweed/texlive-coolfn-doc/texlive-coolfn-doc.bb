SUMMARY = "Documentation for texlive-coolfn"
DESCRIPTION = "This package includes the documentation for texlive-coolfn"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.1.0svn66221"

RPM_NAME = "texlive-coolfn-doc-2023.204.1.1.0svn66221-54.1.noarch.rpm"
RPM_HASH = "f8a5fb47863f5d51dd28e7c0f3e1fb34df0e2427cfa3a8d9536c7096e98aef43c154a92fb4a72601bdb3591afe1315142421cf1ee18544f10bdb9ccb9e2f5980"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coolfn-doc"

RDEPENDS:${PN} += ""

inherit rpm
