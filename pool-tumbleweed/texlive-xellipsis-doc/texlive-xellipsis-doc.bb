SUMMARY = "Documentation for texlive-xellipsis"
DESCRIPTION = "This package includes the documentation for texlive-xellipsis"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn47546"

RPM_NAME = "texlive-xellipsis-doc-2023.209.2.0svn47546-53.2.noarch.rpm"
RPM_HASH = "d9a2423d58eb05e1577c5e557ccec542946af0a620f2d1a39aa79281c76f821534600279622240cbb0045a420469c208d8d16b0f040959ffb6605314a5b1eebc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xellipsis-doc"

RDEPENDS:${PN} += ""

inherit rpm
