SUMMARY = "Documentation for texlive-coolfn"
DESCRIPTION = "This package includes the documentation for texlive-coolfn"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn66221"

RPM_NAME = "texlive-coolfn-doc-2023.209.1.1.0svn66221-55.1.noarch.rpm"
RPM_HASH = "2c94fa8bd0697cc3600990520ee95c2c550a55f184e447e88bb1640370a444faa0441e3c141c8754887a99745b7b2cc43d6418c64609a17bf110e7a73bb23dd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coolfn-doc"

RDEPENDS:${PN} += ""

inherit rpm
