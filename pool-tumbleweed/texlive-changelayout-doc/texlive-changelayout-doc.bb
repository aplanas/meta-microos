SUMMARY = "Documentation for texlive-changelayout"
DESCRIPTION = "This package includes the documentation for texlive-changelayout"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn16094"

RPM_NAME = "texlive-changelayout-doc-2023.201.1.0svn16094-52.1.noarch.rpm"
RPM_HASH = "1ab66514bc5382fae99eb28b720a1f615fd11d8ceb6d3a057f8af91b43cc29749763ccbe77c39e7d3a9edd3fc7298f75e9e5d4916a003261dcbd4e44ac5698ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-changelayout-doc"

RDEPENDS:${PN} += ""

inherit rpm
