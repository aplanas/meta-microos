SUMMARY = "Documentation for texlive-helmholtz-ellis-ji-notation"
DESCRIPTION = "This package includes the documentation for texlive-helmholtz-ellis-ji-notation"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn55213"

RPM_NAME = "texlive-helmholtz-ellis-ji-notation-doc-2023.201.1.1svn55213-53.2.noarch.rpm"
RPM_HASH = "1c84443d9c42c43eefceb69f0a6162d27ff8766c8dfdd55d5e43b34738328e6bfb6eea6fd696e481cba387085b4ddd35c4f15ab299a5dbaf1ad1077915833162"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-helmholtz-ellis-ji-notation-doc"

RDEPENDS:${PN} += ""

inherit rpm
