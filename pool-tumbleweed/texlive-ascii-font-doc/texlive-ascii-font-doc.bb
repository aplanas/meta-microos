SUMMARY = "Documentation for texlive-ascii-font"
DESCRIPTION = "This package includes the documentation for texlive-ascii-font"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn29989"

RPM_NAME = "texlive-ascii-font-doc-2023.201.2.0svn29989-53.1.noarch.rpm"
RPM_HASH = "fa1a715306964882ffbc75aa1549ebd63b1f4a58213e62a7bce5cd7133c45db65af5644df5b97a9eac86f2170060a2536502e7533ee7c2cf1240948bd1ea3692"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ascii-font-doc"

RDEPENDS:${PN} += ""

inherit rpm
