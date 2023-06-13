SUMMARY = "Documentation for texlive-lapdf"
DESCRIPTION = "This package includes the documentation for texlive-lapdf"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn23806"

RPM_NAME = "texlive-lapdf-doc-2023.201.1.1svn23806-55.1.noarch.rpm"
RPM_HASH = "4f49d3f43b3b94af1d4dba67c996e654e76e96fb44f0e8912574ff8b01b381fa97f1883cee987dc0ee2e611aff4f4849233faf9803ad10a9c4312c4d16fcbc66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lapdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
