SUMMARY = "Documentation for texlive-chemexec"
DESCRIPTION = "This package includes the documentation for texlive-chemexec"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21632"

RPM_NAME = "texlive-chemexec-doc-2023.209.1.0svn21632-54.1.noarch.rpm"
RPM_HASH = "f55d0e82af7b8160b57bc8e7e8bcfc921f68aecaf5dcecbfec1947759e3dc758e3146eedc7bc1e1989ab1122725979853b6c2213458acf9bc7bc12ebb99ab4cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chemexec-doc-de;en \
texlive-chemexec-doc"

RDEPENDS:${PN} += ""

inherit rpm
