SUMMARY = "Documentation for texlive-pst-intersect"
DESCRIPTION = "This package includes the documentation for texlive-pst-intersect"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn33210"

RPM_NAME = "texlive-pst-intersect-doc-2023.201.0.0.4svn33210-52.1.noarch.rpm"
RPM_HASH = "d7365de2110cbe37dc7e798c5359cbcfd64aa0f34d7f974695557f4fe3e7deab1a20e791e4e9834d06a96a429ef1ddcfd22d4ac7644ae4c62bb489fda728f586"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pst-intersect-doc-de;en \
texlive-pst-intersect-doc"

RDEPENDS:${PN} += ""

inherit rpm
