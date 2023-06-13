SUMMARY = "Documentation for texlive-verbatimbox"
DESCRIPTION = "This package includes the documentation for texlive-verbatimbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.13svn33197"

RPM_NAME = "texlive-verbatimbox-doc-2023.201.3.13svn33197-53.1.noarch.rpm"
RPM_HASH = "b1bb46ec752b078b090d9979b83ee8da7d7f3f8f9b9dfd23b68646a5c8fadb871c4dd65fcfaf6e210fcdbbd105c666f62f58a8173cbaa7242929e5839353aa46"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-verbatimbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
