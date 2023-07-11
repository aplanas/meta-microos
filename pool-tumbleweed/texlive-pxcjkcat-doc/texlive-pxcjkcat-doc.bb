SUMMARY = "Documentation for texlive-pxcjkcat"
DESCRIPTION = "This package includes the documentation for texlive-pxcjkcat"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn63967"

RPM_NAME = "texlive-pxcjkcat-doc-2023.201.1.4svn63967-53.2.noarch.rpm"
RPM_HASH = "ad72fb83e85e8207f5db5361332e930d717beaf2223cc8cade0dee4b6e80c0111fcea479258110aae823b13d2a31f46407a417f138a1284d7cd93334caadba63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxcjkcat-doc-ja;en \
texlive-pxcjkcat-doc"

RDEPENDS:${PN} += ""

inherit rpm
