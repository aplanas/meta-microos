SUMMARY = "Documentation for texlive-yafoot"
DESCRIPTION = "This package includes the documentation for texlive-yafoot"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn48568"

RPM_NAME = "texlive-yafoot-doc-2023.209.1.1svn48568-53.1.noarch.rpm"
RPM_HASH = "f5b12f5fcc3b66a5c733cb2266f6f60412206fccdb55add488fc2b78b7fee255da03a0f67784cf2e49e42ae494a11f9c99829f413a5ac9d54e1d33bac060b0c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yafoot-doc"

RDEPENDS:${PN} += ""

inherit rpm
