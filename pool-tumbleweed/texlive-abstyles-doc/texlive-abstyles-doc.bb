SUMMARY = "Documentation for texlive-abstyles"
DESCRIPTION = "This package includes the documentation for texlive-abstyles"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-abstyles-doc-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "b42129ed2b5825da665cdb3fa3bd352d3aae29c94c34e4238d9c05f44107219cb7747dd28ef30cea6997e4eb32a291a060d5f5bfcde49d89130210e437a4c45b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-abstyles-doc-de \
texlive-abstyles-doc"

RDEPENDS:${PN} += ""

inherit rpm
