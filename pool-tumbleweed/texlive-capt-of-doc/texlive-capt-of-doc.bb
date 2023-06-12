SUMMARY = "Documentation for texlive-capt-of"
DESCRIPTION = "This package includes the documentation for texlive-capt-of"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29803"

RPM_NAME = "texlive-capt-of-doc-2023.201.svn29803-52.1.noarch.rpm"
RPM_HASH = "bf02d543c8e45d315cda239c3abd90ddbf5b0a632a8c2a5a48cd37964afbe2f9d78fff24863b419988f3efded25461d67e33f3e35ea80bfc33f09ae53a1fb350"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-capt-of-doc"
RDEPENDS:${PN} += ""

inherit rpm
