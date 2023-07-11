SUMMARY = "Documentation for texlive-ecv"
DESCRIPTION = "This package includes the documentation for texlive-ecv"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn24928"

RPM_NAME = "texlive-ecv-doc-2023.201.0.0.3svn24928-53.2.noarch.rpm"
RPM_HASH = "b17459bfa0c4e7327c0213693ba992dbeb42b505cdddfee8e0a4a8ac6644de283c5a7330d9efe3b3a1d97b03d993d4372212311d22ca2d85c6161937cc874e43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ecv-doc-de;en \
texlive-ecv-doc"

RDEPENDS:${PN} += ""

inherit rpm
