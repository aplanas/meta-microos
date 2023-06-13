SUMMARY = "Documentation for texlive-bussproofs"
DESCRIPTION = "This package includes the documentation for texlive-bussproofs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn54080"

RPM_NAME = "texlive-bussproofs-doc-2023.201.1.1svn54080-52.1.noarch.rpm"
RPM_HASH = "0b269af446f42f091b2e17eb5927a6198b44d08fec3c32605f308b51e1ac07b73dec9d526b7b7381b56a05a035db7b33be135717ef06cde7a25805c45137046e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bussproofs-doc"

RDEPENDS:${PN} += ""

inherit rpm
