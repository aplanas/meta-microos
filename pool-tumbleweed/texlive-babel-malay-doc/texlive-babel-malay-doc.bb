SUMMARY = "Documentation for texlive-babel-malay"
DESCRIPTION = "This package includes the documentation for texlive-babel-malay"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0msvn43234"

RPM_NAME = "texlive-babel-malay-doc-2023.201.1.0msvn43234-53.1.noarch.rpm"
RPM_HASH = "7f195ede64be621d3d1a571fa78cf391de8f97e8e4a4ac09d0d1a19d394ddb5422f1edd73037b110f01fa7377a951e140cfc3ffcd3c1751e43a9a1790d5ee0fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-malay-doc"

RDEPENDS:${PN} += ""

inherit rpm
