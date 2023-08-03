SUMMARY = "Documentation for texlive-xoptarg"
DESCRIPTION = "This package includes the documentation for texlive-xoptarg"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-xoptarg-doc-2023.209.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "bae8cc8340821326a75edb802a7a88a282e33f5a296858be50559c7d057cbb8a35524051fabd4f3fef66f7069ee85c4cdc2fc30e91df85bb5910a70cd42ccfa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xoptarg-doc"

RDEPENDS:${PN} += ""

inherit rpm
