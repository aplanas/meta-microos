SUMMARY = "Documentation for texlive-tikzfill"
DESCRIPTION = "This package includes the documentation for texlive-tikzfill"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.0svn63947"

RPM_NAME = "texlive-tikzfill-doc-2023.201.1.0.0svn63947-52.1.noarch.rpm"
RPM_HASH = "ffeae1b1f51e91b1ed2eb9f2dde6cb46ce66e57969dec1119970e7fd783f6e803e6652dc9914e61e1f2191911cfff8b69bb63ad1966a60932b0eebdf41287708"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzfill-doc"

RDEPENDS:${PN} += ""

inherit rpm
