SUMMARY = "Documentation for texlive-getmap"
DESCRIPTION = "This package includes the documentation for texlive-getmap"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.11svn50589"

RPM_NAME = "texlive-getmap-doc-2023.201.1.11svn50589-52.1.noarch.rpm"
RPM_HASH = "de96e43fd6c65b42a151ede2f5de60b7cd304d7db7a5e6eeaf6b84f0e33a619022a27107e451c994c8daff7f06fd100b2b1575c68c686772a0d4854fbe6798fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-getmap-doc"
RDEPENDS:${PN} += ""

inherit rpm
