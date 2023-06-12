SUMMARY = "Documentation for texlive-phfextendedabstract"
DESCRIPTION = "This package includes the documentation for texlive-phfextendedabstract"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn60732"

RPM_NAME = "texlive-phfextendedabstract-doc-2023.201.1.0svn60732-51.1.noarch.rpm"
RPM_HASH = "52bb2d905c8b117219b4de12e9e305b8f34914fb3c873bd00c5995f17686828d6ce23550f493bf0311223eec6189be4334050a7b0f34738c0a40a5ddd14db3ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfextendedabstract-doc"
RDEPENDS:${PN} += ""

inherit rpm
