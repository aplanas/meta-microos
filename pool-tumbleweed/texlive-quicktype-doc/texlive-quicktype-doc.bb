SUMMARY = "Documentation for texlive-quicktype"
DESCRIPTION = "This package includes the documentation for texlive-quicktype"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn42183"

RPM_NAME = "texlive-quicktype-doc-2023.209.0.0.1svn42183-54.2.noarch.rpm"
RPM_HASH = "014d279925a70fb03c2adf04971a70c7a190ef7c96f1cf357460e0ef38fcdc021aeef1f8a7dac65b1c3688c830b45eec1f1801e91d1ade8084bc800d86f65115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quicktype-doc"

RDEPENDS:${PN} += ""

inherit rpm
