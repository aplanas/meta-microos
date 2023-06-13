SUMMARY = "Documentation for texlive-maze"
DESCRIPTION = "This package includes the documentation for texlive-maze"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn65508"

RPM_NAME = "texlive-maze-doc-2023.201.1.2svn65508-52.1.noarch.rpm"
RPM_HASH = "71fd69deb56ebd93f224e90f39f83bdf42fe9878feddd8aaa88a0d3841d0b196e5d15c91b49096dccf4103c78989d66bca85bf7691917b40d7a70bbdf87f802d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-maze-doc"

RDEPENDS:${PN} += ""

inherit rpm
