SUMMARY = "Documentation for texlive-allrunes"
DESCRIPTION = "This package includes the documentation for texlive-allrunes"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1.1svn42221"

RPM_NAME = "texlive-allrunes-doc-2023.201.2.1.1svn42221-54.1.noarch.rpm"
RPM_HASH = "2b01935bedfb044671476f45896c829de1228ca44b80edd269074a3a54aa906330f110c162149a51d66805d1be0202df195917b1584ab100af36e07ba45bd6b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-allrunes-doc"
RDEPENDS:${PN} += ""

inherit rpm
