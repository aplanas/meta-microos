SUMMARY = "Documentation for texlive-exsol"
DESCRIPTION = "This package includes the documentation for texlive-exsol"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn48977"

RPM_NAME = "texlive-exsol-doc-2023.201.1.4svn48977-52.1.noarch.rpm"
RPM_HASH = "ce7d6b3a30f3a82a35faf0eec807f0e7d60780419f97e8cf12422f14d2a65c884b9429159d2b0397423fc7b0cd6ca84b6d36b6d20e2782dd8d980b07f59f068a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exsol-doc"
RDEPENDS:${PN} += ""

inherit rpm
