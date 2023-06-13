SUMMARY = "Documentation for texlive-duckuments"
DESCRIPTION = "This package includes the documentation for texlive-duckuments"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn52271"

RPM_NAME = "texlive-duckuments-doc-2023.201.0.0.5svn52271-52.1.noarch.rpm"
RPM_HASH = "15c9373675a80eb0bcce491e4e4aab4b48afd5c131b7d03cc0adfd9e9e2ee1437bb2d4532374e362ba06d18e18e3dd4d519db1583c1ec59933cd98c1a2dea330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-duckuments-doc"

RDEPENDS:${PN} += ""

inherit rpm
