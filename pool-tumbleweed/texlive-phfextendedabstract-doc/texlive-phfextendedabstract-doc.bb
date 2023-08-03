SUMMARY = "Documentation for texlive-phfextendedabstract"
DESCRIPTION = "This package includes the documentation for texlive-phfextendedabstract"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn60732"

RPM_NAME = "texlive-phfextendedabstract-doc-2023.209.1.0svn60732-52.1.noarch.rpm"
RPM_HASH = "b4eec23b529910685a6ac878c5efd6fdfc22584594b9ca60ff69bef0a681fbc9256faa73e99e3a8fd8d486350ee8981bc1f51a9b01ca081ddea51d9270a54fdc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-phfextendedabstract-doc"

RDEPENDS:${PN} += ""

inherit rpm
