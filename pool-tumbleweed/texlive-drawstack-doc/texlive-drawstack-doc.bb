SUMMARY = "Documentation for texlive-drawstack"
DESCRIPTION = "This package includes the documentation for texlive-drawstack"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn28582"

RPM_NAME = "texlive-drawstack-doc-2023.209.svn28582-53.1.noarch.rpm"
RPM_HASH = "f29ca06738406cf17e2576ab55edced8b3657afff381d89f30672294064d2b563ca36f65d7f6653693d050cc74f2224d5d11ee816833b5d545ddb414c0ff630c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-drawstack-doc"

RDEPENDS:${PN} += ""

inherit rpm
