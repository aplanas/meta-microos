SUMMARY = "Documentation for texlive-pxgreeks"
DESCRIPTION = "This package includes the documentation for texlive-pxgreeks"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21838"

RPM_NAME = "texlive-pxgreeks-doc-2023.209.1.0svn21838-54.1.noarch.rpm"
RPM_HASH = "1330e297faf3e8aa52b3b2938a9e6180a8472fd93a80feb720cbd334123aafa9450661e46765fb62e1acdbf1816b870410f6588dced068e9f940e7467a9a0dc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxgreeks-doc"

RDEPENDS:${PN} += ""

inherit rpm
