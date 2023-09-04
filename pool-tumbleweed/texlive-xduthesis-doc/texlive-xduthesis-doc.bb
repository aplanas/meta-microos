SUMMARY = "Documentation for texlive-xduthesis"
DESCRIPTION = "This package includes the documentation for texlive-xduthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn63116"

RPM_NAME = "texlive-xduthesis-doc-2023.209.1.00svn63116-53.2.noarch.rpm"
RPM_HASH = "97743e1b4633b246608445a2f03b6a3b1e90ce6f08c9a1b2f5994c8824f8507e82c6d47756fc20f346cccf6aebf233a27484ae84086d72341cd7010484201429"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xduthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
