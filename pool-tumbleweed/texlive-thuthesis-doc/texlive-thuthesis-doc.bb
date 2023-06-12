SUMMARY = "Documentation for texlive-thuthesis"
DESCRIPTION = "This package includes the documentation for texlive-thuthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.7.3.1svn64628"

RPM_NAME = "texlive-thuthesis-doc-2023.201.7.3.1svn64628-54.1.noarch.rpm"
RPM_HASH = "791b746ff21ae0c2e90438e45b58ad47febbcf2db5470cf919cddcf2f6939d58ad6f7edbb1d3bb4858f5426a2d9934fccc6295ae131ba3d6136f3b455523f8d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-thuthesis-doc:zh) \
texlive-thuthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
