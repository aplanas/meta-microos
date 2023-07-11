SUMMARY = "Documentation for texlive-luaprogtable"
DESCRIPTION = "This package includes the documentation for texlive-luaprogtable"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn56113"

RPM_NAME = "texlive-luaprogtable-doc-2023.208.1.0svn56113-53.1.noarch.rpm"
RPM_HASH = "2644482c2bfeedf66aed24ad033abd7848fc0dbd4b2ca8474cfb17ce04ed85d155a075a84d76895d1bb227066e110b2347792d27d43b2d9dd26efdf91e521989"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaprogtable-doc"

RDEPENDS:${PN} += ""

inherit rpm
