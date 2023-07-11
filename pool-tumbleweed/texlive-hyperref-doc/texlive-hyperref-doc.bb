SUMMARY = "Documentation for texlive-hyperref"
DESCRIPTION = "This package includes the documentation for texlive-hyperref"
LICENSE = "LPPL-1.0"

PV = "2023.208.7.00vsvn65758"

RPM_NAME = "texlive-hyperref-doc-2023.208.7.00vsvn65758-53.1.noarch.rpm"
RPM_HASH = "ee540848d439a0118e1c8ec20562bf6337338cd411c7079d222af38ec674b660a9704c95609b9040ce34fa2c8bef7ac5208493c31ad22cf10c24fd0c0b0b1436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hyperref-doc-en \
texlive-hyperref-doc"

RDEPENDS:${PN} += ""

inherit rpm
