SUMMARY = "Documentation for texlive-luakeys"
DESCRIPTION = "This package includes the documentation for texlive-luakeys"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13.0svn65533"

RPM_NAME = "texlive-luakeys-doc-2023.201.0.0.13.0svn65533-52.1.noarch.rpm"
RPM_HASH = "528c26148eddeb9dacf0511b86ed1611dc273e3c9ad4208f72fb28a01fd6754015f19b70bb6915c6dcae7e5889c53de7301a05bd34872793e7009c7c5b172888"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luakeys-doc"

RDEPENDS:${PN} += ""

inherit rpm
