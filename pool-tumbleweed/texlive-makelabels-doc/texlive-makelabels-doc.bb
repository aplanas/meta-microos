SUMMARY = "Documentation for texlive-makelabels"
DESCRIPTION = "This package includes the documentation for texlive-makelabels"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn60255"

RPM_NAME = "texlive-makelabels-doc-2023.208.1.0svn60255-53.1.noarch.rpm"
RPM_HASH = "f6ecc21478b1d3279a4281696f1b9f884e12bd1ff2bdea58a10148220845074a95279f905d714a3274801e39088ac4c946df5bb627c460be76618d0b4b15e72d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makelabels-doc"

RDEPENDS:${PN} += ""

inherit rpm
