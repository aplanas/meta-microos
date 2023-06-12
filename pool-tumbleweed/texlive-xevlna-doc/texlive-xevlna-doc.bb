SUMMARY = "Documentation for texlive-xevlna"
DESCRIPTION = "This package includes the documentation for texlive-xevlna"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn43864"

RPM_NAME = "texlive-xevlna-doc-2023.201.1.1svn43864-52.1.noarch.rpm"
RPM_HASH = "7292082483df214f31ae5f01d6801d93d7bf7ee2ab505d829ef99087eb0291778719bc5466ca41d11fc6f11817fb5101eb8e8268b73b0ccc83ef6b60bb3dc48d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xevlna-doc"
RDEPENDS:${PN} += ""

inherit rpm
