SUMMARY = "Documentation for texlive-lua-widow-control"
DESCRIPTION = "This package includes the documentation for texlive-lua-widow-control"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0.0svn65084"

RPM_NAME = "texlive-lua-widow-control-doc-2023.201.3.0.0svn65084-52.1.noarch.rpm"
RPM_HASH = "20b3a897fa2267d766ce874821156fa39763f986cb62e93879b59cb513c50b8cd9f449860e57c497e59a6942e21bb25443431d5b3bf3f469235a4eb98a66c693"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-widow-control-doc"

RDEPENDS:${PN} += ""

inherit rpm
