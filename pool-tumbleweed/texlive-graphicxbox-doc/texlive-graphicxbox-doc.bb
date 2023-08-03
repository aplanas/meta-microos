SUMMARY = "Documentation for texlive-graphicxbox"
DESCRIPTION = "This package includes the documentation for texlive-graphicxbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn32630"

RPM_NAME = "texlive-graphicxbox-doc-2023.209.1.0svn32630-54.1.noarch.rpm"
RPM_HASH = "9e4549336a165959927040197cd17853557d60185c99110c7bef1a2829be86a5e2d46888dfb416e184e6b20ccab8a932c3c9574aca4e401950019051272cc2f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphicxbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
