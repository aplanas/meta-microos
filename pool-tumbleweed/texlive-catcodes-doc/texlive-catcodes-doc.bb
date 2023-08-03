SUMMARY = "Documentation for texlive-catcodes"
DESCRIPTION = "This package includes the documentation for texlive-catcodes"
LICENSE = "LPPL-1.0"

PV = "2023.209.r0.2svn38859"

RPM_NAME = "texlive-catcodes-doc-2023.209.r0.2svn38859-53.1.noarch.rpm"
RPM_HASH = "ba5c0eb9e7444e7138620ae2b56108a4552d294a87739475b97196968d02d69f6ec3a4e5a728cb0b116803fde4b0f1b3457937702cba40651aed65865d065349"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-catcodes-doc"

RDEPENDS:${PN} += ""

inherit rpm
