SUMMARY = "Documentation for texlive-xq"
DESCRIPTION = "This package includes the documentation for texlive-xq"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn35211"

RPM_NAME = "texlive-xq-doc-2023.201.0.0.4svn35211-52.1.noarch.rpm"
RPM_HASH = "c937c2224dcf306987a245684d8f6401610e1faea0c12063071af888ab4574100540b1839fd399f017d068ab0b0420b366962a96666fba6a25543c7fa09ff4a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xq-doc"

RDEPENDS:${PN} += ""

inherit rpm
