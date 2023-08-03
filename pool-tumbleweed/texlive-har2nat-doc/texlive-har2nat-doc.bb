SUMMARY = "Documentation for texlive-har2nat"
DESCRIPTION = "This package includes the documentation for texlive-har2nat"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54080"

RPM_NAME = "texlive-har2nat-doc-2023.209.1.0svn54080-54.1.noarch.rpm"
RPM_HASH = "b666c2ad454a3b2a48b4407fcac1a9bfaa02b61f678337c297e7d0220545e1b87feeea23c28159a265bc058d20cc8379b6bef2bc2438e7f3e907b1ef8b98d6c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-har2nat-doc"

RDEPENDS:${PN} += ""

inherit rpm
