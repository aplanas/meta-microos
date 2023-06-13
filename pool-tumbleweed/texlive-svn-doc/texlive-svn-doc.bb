SUMMARY = "Documentation for texlive-svn"
DESCRIPTION = "This package includes the documentation for texlive-svn"
LICENSE = "LPPL-1.0"

PV = "2023.201.43svn15878"

RPM_NAME = "texlive-svn-doc-2023.201.43svn15878-57.1.noarch.rpm"
RPM_HASH = "eb31a6769189dca765bec38955d9f1ed1bf21f55716a92ca275f57d8baf2de4ca0e3488b64bcd3d7dc412d8de2d1ed2585869bcb1d443986158af156b0f1f670"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-svn-doc"

RDEPENDS:${PN} += ""

inherit rpm
