SUMMARY = "Documentation for texlive-xdoc"
DESCRIPTION = "This package includes the documentation for texlive-xdoc"
LICENSE = "LPPL-1.0"

PV = "2023.201.prot2.5svn15878"

RPM_NAME = "texlive-xdoc-doc-2023.201.prot2.5svn15878-52.2.noarch.rpm"
RPM_HASH = "0769e7bb40bfbb6baa572fbe6cceea2f3cbdf391112e17ac711ce598b79b1c0c918e25487fafc887878f0ea0ac7f32336953f86e5b0e21969dd0d1802939d98a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xdoc-doc"

RDEPENDS:${PN} += ""

inherit rpm
