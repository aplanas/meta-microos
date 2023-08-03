SUMMARY = "Documentation for texlive-cdpbundl"
DESCRIPTION = "This package includes the documentation for texlive-cdpbundl"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.36dsvn61719"

RPM_NAME = "texlive-cdpbundl-doc-2023.209.0.0.36dsvn61719-53.1.noarch.rpm"
RPM_HASH = "ded7b11b69c29b4e7491e95e031b67cba9ad150784560816fc4d739657445a54b5b3711f62cf46c957ec574ee36c3b2248da0804415b4c49b14b3da589052093"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cdpbundl-doc"

RDEPENDS:${PN} += ""

inherit rpm
