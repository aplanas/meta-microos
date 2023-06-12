SUMMARY = "Documentation for texlive-bidi"
DESCRIPTION = "This package includes the documentation for texlive-bidi"
LICENSE = "LPPL-1.0"

PV = "2023.201.39.7svn65572"

RPM_NAME = "texlive-bidi-doc-2023.201.39.7svn65572-53.1.noarch.rpm"
RPM_HASH = "d7f7a90921b5299f52802ee371b4d811757a1c05d07e523df83c5868bebef1711284fb6d72a7cc5ef90cfb2e7523ad92d26ef5f9874839eab4d9813b3d247762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidi-doc"
RDEPENDS:${PN} += ""

inherit rpm
