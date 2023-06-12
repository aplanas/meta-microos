SUMMARY = "Documentation for texlive-helmholtz-ellis-ji-notation"
DESCRIPTION = "This package includes the documentation for texlive-helmholtz-ellis-ji-notation"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn55213"

RPM_NAME = "texlive-helmholtz-ellis-ji-notation-doc-2023.201.1.1svn55213-53.1.noarch.rpm"
RPM_HASH = "6e20a001c7b2141586a2b9ebf9b1bbfb68a2d65cb1b06bfae6736d4c8e66b222902b68d02d7188e30abc5cd36daaaf483159e16861ddfe6e9eb18332195fbe5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-helmholtz-ellis-ji-notation-doc"
RDEPENDS:${PN} += ""

inherit rpm
