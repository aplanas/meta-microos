SUMMARY = "Documentation for texlive-typogrid"
DESCRIPTION = "This package includes the documentation for texlive-typogrid"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.21svn24994"

RPM_NAME = "texlive-typogrid-doc-2023.201.0.0.21svn24994-52.1.noarch.rpm"
RPM_HASH = "f9036200b90d3ce3db3860648976fc7bf8a802b07c03472a9c4128946718fe6add9f27926ccb172c3653bad886c2460aeb6f86765c54819fc05e0f3ab6a1e690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typogrid-doc"
RDEPENDS:${PN} += ""

inherit rpm
