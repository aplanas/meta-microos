SUMMARY = "Documentation for texlive-lm"
DESCRIPTION = "This package includes the documentation for texlive-lm"
LICENSE = "LPPL-1.3c"

PV = "2023.209.2.005svn65956"

RPM_NAME = "texlive-lm-doc-2023.209.2.005svn65956-55.1.noarch.rpm"
RPM_HASH = "65a2fbdea1ac88f469c5d2cf404d46e49aa77bd014de524dc822e1304b3ed0b9dc196e74aaae0290c535eb61409bac543414d222963383d8fafea65041cd9bf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lm-doc"

RDEPENDS:${PN} += ""

inherit rpm
