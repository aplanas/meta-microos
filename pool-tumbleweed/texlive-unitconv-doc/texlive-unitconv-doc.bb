SUMMARY = "Documentation for texlive-unitconv"
DESCRIPTION = "This package includes the documentation for texlive-unitconv"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.01svn55060"

RPM_NAME = "texlive-unitconv-doc-2023.201.0.0.01svn55060-53.1.noarch.rpm"
RPM_HASH = "875b5e8a8da714c484f844c483c302945734ed312575e08e1007829fd37276f319a0c242c29b6cb6cd6527b6276e5ae405d302f52af6161c81b4afdb817ba458"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unitconv-doc"
RDEPENDS:${PN} += ""

inherit rpm
