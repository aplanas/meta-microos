SUMMARY = "Documentation for texlive-gckanbun"
DESCRIPTION = "This package includes the documentation for texlive-gckanbun"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn61719"

RPM_NAME = "texlive-gckanbun-doc-2023.201.1.2svn61719-52.1.noarch.rpm"
RPM_HASH = "befc6923efc2eb00412e0796f98d726a704ebccdabf66f0ac30b58e1af3486c947e76f30aa8909673fdd2ac0fb5d6794fe31ee4d2de10b7394a7e18e6ebc2c4a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gckanbun-doc"

RDEPENDS:${PN} += ""

inherit rpm
