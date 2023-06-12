SUMMARY = "Documentation for texlive-theanomodern"
DESCRIPTION = "This package includes the documentation for texlive-theanomodern"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64520"

RPM_NAME = "texlive-theanomodern-doc-2023.201.svn64520-54.1.noarch.rpm"
RPM_HASH = "8d587e9641ab66b15d57c5404e0ada3e7b702fcb505d3eeaf3bb8957a1c52412ff066e73118f60b5a2ff9311fd76f857a7847af280de765f4205caf30af89171"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-theanomodern-doc"
RDEPENDS:${PN} += ""

inherit rpm
