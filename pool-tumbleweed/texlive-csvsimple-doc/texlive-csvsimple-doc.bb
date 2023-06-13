SUMMARY = "Documentation for texlive-csvsimple"
DESCRIPTION = "This package includes the documentation for texlive-csvsimple"
LICENSE = "LPPL-1.0"

PV = "2023.204.2.3.2svn64450"

RPM_NAME = "texlive-csvsimple-doc-2023.204.2.3.2svn64450-54.1.noarch.rpm"
RPM_HASH = "194fefa33c25336e7636a04879ecd8ae774f489e3c3f74d624b1b16b254ce06af47a24186c98d77340fcb78ad1e1563f528cdc1efda07abb05f3d9473f4fd97a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-csvsimple-doc"

RDEPENDS:${PN} += ""

inherit rpm
