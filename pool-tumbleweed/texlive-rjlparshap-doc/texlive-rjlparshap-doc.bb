SUMMARY = "Documentation for texlive-rjlparshap"
DESCRIPTION = "This package includes the documentation for texlive-rjlparshap"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-rjlparshap-doc-2023.209.1.0svn15878-54.2.noarch.rpm"
RPM_HASH = "903af6f78a745267c6753b2a13b56b7ed542ec82d01e9d18762dab8d80d6c772c87ca4166780efa70854817b1d94c57d2a394e6a9c0b6540fdd25bc4b86816eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rjlparshap-doc"

RDEPENDS:${PN} += ""

inherit rpm
