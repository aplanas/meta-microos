SUMMARY = "Documentation for texlive-econ-bst"
DESCRIPTION = "This package includes the documentation for texlive-econ-bst"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1.1svn61499"

RPM_NAME = "texlive-econ-bst-doc-2023.201.3.1.1svn61499-53.1.noarch.rpm"
RPM_HASH = "ec9ccf44ae12a5e4ce89228ff1fe7b9e6059f1d0b777230254aa6e1cee2d3af378d268d2224e30a8b9c2d58a328f48c5f4cdf7715aaa196dc0fa05a69a4b1385"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econ-bst-doc"

RDEPENDS:${PN} += ""

inherit rpm
