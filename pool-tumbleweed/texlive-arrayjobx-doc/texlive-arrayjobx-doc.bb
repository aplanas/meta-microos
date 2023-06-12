SUMMARY = "Documentation for texlive-arrayjobx"
DESCRIPTION = "This package includes the documentation for texlive-arrayjobx"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.04svn18125"

RPM_NAME = "texlive-arrayjobx-doc-2023.201.1.04svn18125-53.1.noarch.rpm"
RPM_HASH = "2980534038a0948bd9f709dc09bea96660611283629c479d9df3afef1456d269ebc654ec1fe4b6d42cfc26880f8d264dab047f4dfdbfd786260497efaf8db2c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arrayjobx-doc"
RDEPENDS:${PN} += ""

inherit rpm
