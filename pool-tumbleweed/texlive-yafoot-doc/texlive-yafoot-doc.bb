SUMMARY = "Documentation for texlive-yafoot"
DESCRIPTION = "This package includes the documentation for texlive-yafoot"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48568"

RPM_NAME = "texlive-yafoot-doc-2023.201.1.1svn48568-52.2.noarch.rpm"
RPM_HASH = "3efd0acb013338b145ee0ebe1ab6404f3528d30cc212b914d89268bcf0720caaeeb0721bb0746467a08b3c1976ff3cc9c38d855c17e2f55dd16e141ed290e5d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yafoot-doc"

RDEPENDS:${PN} += ""

inherit rpm
