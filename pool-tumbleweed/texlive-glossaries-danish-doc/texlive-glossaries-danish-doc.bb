SUMMARY = "Documentation for texlive-glossaries-danish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-danish"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-danish-doc-2023.209.1.0svn35665-54.1.noarch.rpm"
RPM_HASH = "c74a964ec179aa856da4510e00bc821467d91e35ddaaa4b1022049bbd877e590b73ccac9f3122b64bc3b11f3aa7370c674caebce50684e958ceaedd37060fab6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-danish-doc"

RDEPENDS:${PN} += ""

inherit rpm
