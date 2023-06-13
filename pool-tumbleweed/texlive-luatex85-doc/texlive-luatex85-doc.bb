SUMMARY = "Documentation for texlive-luatex85"
DESCRIPTION = "This package includes the documentation for texlive-luatex85"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn41456"

RPM_NAME = "texlive-luatex85-doc-2023.201.1.4svn41456-52.1.noarch.rpm"
RPM_HASH = "779b88899c04e884da02b82f6de77248b70437ad99236b9991406fbb82102fd05c9012da221998cb2ac5d1e57e0ea80867dfe1c7f4a8168bb9708df3530af092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luatex85-doc"

RDEPENDS:${PN} += ""

inherit rpm
