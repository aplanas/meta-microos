SUMMARY = "Documentation for texlive-makecmds"
DESCRIPTION = "This package includes the documentation for texlive-makecmds"
LICENSE = "LPPL-1.0"

PV = "2023.208.svn15878"

RPM_NAME = "texlive-makecmds-doc-2023.208.svn15878-53.1.noarch.rpm"
RPM_HASH = "b7dc2a6db004bfef4dda91f428507885d8e4e4b39bbbb15b15bcdb698286fae80dd760dc0e1cab7410ba680b35fe735441729ec5c7d08594aad209d4b3612000"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makecmds-doc"

RDEPENDS:${PN} += ""

inherit rpm
