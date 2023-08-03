SUMMARY = "Documentation for texlive-pxchfon"
DESCRIPTION = "This package includes the documentation for texlive-pxchfon"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9asvn66064"

RPM_NAME = "texlive-pxchfon-doc-2023.209.1.9asvn66064-54.1.noarch.rpm"
RPM_HASH = "c68b328944b3fba7d72492e7b9c9c32d19fedc95c3015d3b4e52d04d169a89b1414d2f9fb36521ff6eff9b6b48fb771328d979b9e2b5673b6f989f653d259bd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxchfon-doc-ja \
texlive-pxchfon-doc"

RDEPENDS:${PN} += ""

inherit rpm
