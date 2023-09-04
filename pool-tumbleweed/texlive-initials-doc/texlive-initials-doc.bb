SUMMARY = "Documentation for texlive-initials"
DESCRIPTION = "This package includes the documentation for texlive-initials"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54080"

RPM_NAME = "texlive-initials-doc-2023.209.svn54080-54.1.noarch.rpm"
RPM_HASH = "5e664f32fa43c29434c8edb8d931836968978b7ffb80266062d8a45b990a0a34ee510146d58abcc5af737d2dd9667fdcf19aab8eea8027b1de0d5e9ce0b13327"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-initials-doc"

RDEPENDS:${PN} += ""

inherit rpm
