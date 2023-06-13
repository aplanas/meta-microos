SUMMARY = "Documentation for texlive-makeshape"
DESCRIPTION = "This package includes the documentation for texlive-makeshape"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn28973"

RPM_NAME = "texlive-makeshape-doc-2023.201.2.1svn28973-52.1.noarch.rpm"
RPM_HASH = "7b8c69c30e3b4905df2877136b9c4d10f380dd99e092281cfbf76471ea41b5b94c7ab1fae7b09a8236757189c81ec0d4505325cfe76d106c2e212a98c856e740"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makeshape-doc"

RDEPENDS:${PN} += ""

inherit rpm
