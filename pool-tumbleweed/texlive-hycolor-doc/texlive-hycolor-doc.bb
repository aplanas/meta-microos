SUMMARY = "Documentation for texlive-hycolor"
DESCRIPTION = "This package includes the documentation for texlive-hycolor"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn53584"

RPM_NAME = "texlive-hycolor-doc-2023.209.1.10svn53584-54.1.noarch.rpm"
RPM_HASH = "850fd32e8a2bd9f34c1658389b66bfdb3add121e4185b312242ae0d8b805ce382282ade8a8653ecaa5c5ce8b3b28f8c329c57e4a023f69a6a705d04e4f1f5273"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hycolor-doc-en \
texlive-hycolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
