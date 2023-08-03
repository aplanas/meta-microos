SUMMARY = "Documentation for texlive-fistrum"
DESCRIPTION = "This package includes the documentation for texlive-fistrum"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn66461"

RPM_NAME = "texlive-fistrum-doc-2023.209.0.0.1svn66461-53.1.noarch.rpm"
RPM_HASH = "796e3b346d313747ec7c830b39d3c8db2d25f5f57fe15b88a5430973e4869ebbf0fac002ca7a3ff225f7ad5f315374c432bf2f5a2ec03226776b466ffedd5ecd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fistrum-doc"

RDEPENDS:${PN} += ""

inherit rpm
