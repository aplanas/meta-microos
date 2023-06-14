SUMMARY = "Documentation for texlive-ted"
DESCRIPTION = "This package includes the documentation for texlive-ted"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn15878"

RPM_NAME = "texlive-ted-doc-2023.201.1.06svn15878-54.1.noarch.rpm"
RPM_HASH = "05bd948c5b7a9602e45c7d1e41505e69ff6a2f554c7fa753e9d92de1f95a504c7708aa175a7db397ce4f1611c5942f3dbe2581a59cca09c480cb1edd2d1b54ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ted-doc-fr \
texlive-ted-doc"

RDEPENDS:${PN} += ""

inherit rpm
