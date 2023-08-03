SUMMARY = "Documentation for texlive-paratype"
DESCRIPTION = "This package includes the documentation for texlive-paratype"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn32859"

RPM_NAME = "texlive-paratype-doc-2023.209.svn32859-52.1.noarch.rpm"
RPM_HASH = "b878203fe879ce026d7f840894a533fa6b4398623bcbc13c97c4f30d19cd84256fccf268071a1dfe494d4b97fc9d4bd7de4e065746ddfecc14f62fbf1f2527fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-paratype-doc"

RDEPENDS:${PN} += ""

inherit rpm
