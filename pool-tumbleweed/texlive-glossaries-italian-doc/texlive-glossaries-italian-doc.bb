SUMMARY = "Documentation for texlive-glossaries-italian"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-italian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-italian-doc-2023.209.1.0svn35665-54.1.noarch.rpm"
RPM_HASH = "0cecdf0a06285ddeeb4ca1c284723855108cdf0e59a7cdaf215d5defee5ae4b06804054edb38353a0e6537a5246f9f556baff6a9c33fc7427cbd5891196c8151"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-italian-doc"

RDEPENDS:${PN} += ""

inherit rpm
