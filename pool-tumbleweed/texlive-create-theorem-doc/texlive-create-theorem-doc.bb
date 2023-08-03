SUMMARY = "Documentation for texlive-create-theorem"
DESCRIPTION = "This package includes the documentation for texlive-create-theorem"
LICENSE = "LPPL-1.0"

PV = "2023.209.20220808asvn64104"

RPM_NAME = "texlive-create-theorem-doc-2023.209.20220808asvn64104-55.1.noarch.rpm"
RPM_HASH = "364396c60d6aaf5641722f13c5047d72745c7ad2896b6e57d0e36d4383a01f75d85900d14f6cd0632d4222df597758444d770d25fdf20059625a76aa5742688e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-create-theorem-doc"

RDEPENDS:${PN} += ""

inherit rpm
