SUMMARY = "Documentation for texlive-fwlw"
DESCRIPTION = "This package includes the documentation for texlive-fwlw"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn29803"

RPM_NAME = "texlive-fwlw-doc-2023.201.svn29803-52.1.noarch.rpm"
RPM_HASH = "fd13140ac6bf1ca812178ecd78ba45acf835957743110048f53aa12e0f270fe68b354c7ae50d9b671f1a61274755f4b0dd156e9d3fad5b367403307ede0fc39d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fwlw-doc"

RDEPENDS:${PN} += ""

inherit rpm
