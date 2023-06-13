SUMMARY = "Documentation for texlive-stdpage"
DESCRIPTION = "This package includes the documentation for texlive-stdpage"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.6svn15878"

RPM_NAME = "texlive-stdpage-doc-2023.201.0.0.6svn15878-57.1.noarch.rpm"
RPM_HASH = "8256b2e8b21773934498aaa4c1b97f946b949e23744372181f06974504f0e2600683eae4ba5914b2074d0eff00222a092a781821420ca5ea8fcf44abdb9f8ed0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stdpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
