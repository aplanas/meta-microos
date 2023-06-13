SUMMARY = "Documentation for texlive-zed-csp"
DESCRIPTION = "This package includes the documentation for texlive-zed-csp"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17258"

RPM_NAME = "texlive-zed-csp-doc-2023.201.svn17258-52.1.noarch.rpm"
RPM_HASH = "249a874f9b21d5c88c1427364027b222398d955c8562ddee8d961488471bbaab3c0de00d21b8694994bd3181162d98dfb16a389de0ad96e24259ce92d328dfa9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zed-csp-doc"

RDEPENDS:${PN} += ""

inherit rpm
