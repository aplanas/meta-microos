SUMMARY = "Documentation for texlive-chess-problem-diagrams"
DESCRIPTION = "This package includes the documentation for texlive-chess-problem-diagrams"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.21svn63708"

RPM_NAME = "texlive-chess-problem-diagrams-doc-2023.209.1.21svn63708-54.1.noarch.rpm"
RPM_HASH = "2c86678fd9c8c40bdb8da8db0c0560cb3e07d8e0a62af1dd9d7ae5f80e1cedf1875a3e68da5f283726a34a73a119cbba8f5be0647b584e5a400d8ef3bb8a81b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chess-problem-diagrams-doc"

RDEPENDS:${PN} += ""

inherit rpm
