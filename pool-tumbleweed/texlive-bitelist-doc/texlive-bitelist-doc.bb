SUMMARY = "Documentation for texlive-bitelist"
DESCRIPTION = "This package includes the documentation for texlive-bitelist"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn25779"

RPM_NAME = "texlive-bitelist-doc-2023.201.0.0.1svn25779-52.1.noarch.rpm"
RPM_HASH = "7c1d421ee41d84920b520870d1f6e48e90796e24f7e1f1040b1171a359e12b23e04a44a69670f7cb0f4fb22fda8e334b1942f6671201a71421e15b7a598c233b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bitelist-doc"

RDEPENDS:${PN} += ""

inherit rpm
