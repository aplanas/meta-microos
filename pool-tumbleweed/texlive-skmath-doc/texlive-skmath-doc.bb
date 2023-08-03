SUMMARY = "Documentation for texlive-skmath"
DESCRIPTION = "This package includes the documentation for texlive-skmath"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5asvn52411"

RPM_NAME = "texlive-skmath-doc-2023.209.0.0.5asvn52411-58.1.noarch.rpm"
RPM_HASH = "29dba932df14c873c6b013ee44fdd8a3d00429ae2e7ac8df0d6c21e984c0298e184a1ff9f102594c8f163cc1b76439dbf745e000fd54cb723ddc2c5b65dc51f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-skmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
