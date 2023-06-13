SUMMARY = "Documentation for texlive-adigraph"
DESCRIPTION = "This package includes the documentation for texlive-adigraph"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7.1svn49862"

RPM_NAME = "texlive-adigraph-doc-2023.201.1.7.1svn49862-54.1.noarch.rpm"
RPM_HASH = "eaf115d185ace32470f40c04484aa9906e05d3dc984a151a8b700de3f3bef104a570e5044ba323360ab60e984d46c5f54e85ff97cfa51f658986fe7c93360569"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-adigraph-doc"

RDEPENDS:${PN} += ""

inherit rpm
