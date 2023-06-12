SUMMARY = "Documentation for texlive-hfutthesis"
DESCRIPTION = "This package includes the documentation for texlive-hfutthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.4svn64025"

RPM_NAME = "texlive-hfutthesis-doc-2023.201.1.0.4svn64025-53.1.noarch.rpm"
RPM_HASH = "d257f631e7a96ed3322400be993dabbdcc6e4f3badd727f8a2229da0c1248bbd39bd4bb36d313cf467360d22ebae1d415ffebd0162e75752a08f0c4a3002df51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-hfutthesis-doc:zh) \
texlive-hfutthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
