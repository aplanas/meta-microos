SUMMARY = "Documentation for texlive-figchild"
DESCRIPTION = "This package includes the documentation for texlive-figchild"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.1svn62945"

RPM_NAME = "texlive-figchild-doc-2023.201.2.1.1svn62945-52.1.noarch.rpm"
RPM_HASH = "0d603ee3016ee4be966999165968cc4e97109a34e3e59c26c6261da900663b8262718417b920b846fac2670a4c71e86d6fb0012fb0436b0f23de0faf2a5fd91d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-figchild-doc"

RDEPENDS:${PN} += ""

inherit rpm
