SUMMARY = "Documentation for texlive-pgfmorepages"
DESCRIPTION = "This package includes the documentation for texlive-pgfmorepages"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.20svn54770"

RPM_NAME = "texlive-pgfmorepages-doc-2023.201.1.20svn54770-51.1.noarch.rpm"
RPM_HASH = "f3c5e10e7316d1323f9da79d3d81ffa92c218e337f55f95c1b258d0912e9366b365ea0a9decff3da31bdb358dfa2536ee61031db8c37a1491789973ba9354db9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfmorepages-doc"

RDEPENDS:${PN} += ""

inherit rpm
