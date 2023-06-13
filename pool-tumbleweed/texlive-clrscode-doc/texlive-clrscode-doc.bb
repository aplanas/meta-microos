SUMMARY = "Documentation for texlive-clrscode"
DESCRIPTION = "This package includes the documentation for texlive-clrscode"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn51136"

RPM_NAME = "texlive-clrscode-doc-2023.201.1.7svn51136-53.1.noarch.rpm"
RPM_HASH = "706d5496b0feb263479138ebecca684b7c68aa3a61d7a03e39be423203bf34194978c13e1d7e173c3a8616a2580dbddbeea78bec6185151160f6d811c8407160"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clrscode-doc"

RDEPENDS:${PN} += ""

inherit rpm
