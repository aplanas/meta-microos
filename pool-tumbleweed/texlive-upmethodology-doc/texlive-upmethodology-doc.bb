SUMMARY = "Documentation for texlive-upmethodology"
DESCRIPTION = "This package includes the documentation for texlive-upmethodology"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.20221004svn64613"

RPM_NAME = "texlive-upmethodology-doc-2023.201.20221004svn64613-53.1.noarch.rpm"
RPM_HASH = "3f7542adffedf30f2fedb37a5eef5e5d17507d5ba499310115d85d7b8d99f29fb67fb29458895c3896dcf7c62dfb8b9e2f307c85630861033ba82e88188fd26b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-upmethodology-doc"

RDEPENDS:${PN} += ""

inherit rpm
