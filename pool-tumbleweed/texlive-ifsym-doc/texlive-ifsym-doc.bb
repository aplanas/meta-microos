SUMMARY = "Documentation for texlive-ifsym"
DESCRIPTION = "This package includes the documentation for texlive-ifsym"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24868"

RPM_NAME = "texlive-ifsym-doc-2023.209.svn24868-54.1.noarch.rpm"
RPM_HASH = "86b9c4f1896fee8502a455a64d81321869b9d132955b4dc237d252d65d114e4b08afc48a50daf669edecdbb2b5ee107a54a04e36a677a0a40a8e529d738677a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-ifsym-doc-de \
texlive-ifsym-doc"

RDEPENDS:${PN} += ""

inherit rpm
