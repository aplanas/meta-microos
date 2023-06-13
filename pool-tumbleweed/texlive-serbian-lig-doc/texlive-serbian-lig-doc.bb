SUMMARY = "Documentation for texlive-serbian-lig"
DESCRIPTION = "This package includes the documentation for texlive-serbian-lig"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn53127"

RPM_NAME = "texlive-serbian-lig-doc-2023.201.svn53127-53.1.noarch.rpm"
RPM_HASH = "8176c675d8d6c8ad9847c66ba79a41ee31c56bb8cd7e24c439c0652328ef90c68a265fa018d0ae3c5bfb035a3432d762b3071097354d40a17837e7789bf815f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-serbian-lig-doc"

RDEPENDS:${PN} += ""

inherit rpm
