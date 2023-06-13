SUMMARY = "Documentation for texlive-fewerfloatpages"
DESCRIPTION = "This package includes the documentation for texlive-fewerfloatpages"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0bsvn58058"

RPM_NAME = "texlive-fewerfloatpages-doc-2023.201.1.0bsvn58058-52.1.noarch.rpm"
RPM_HASH = "0bf25ff3c0658c68f6fe12baf03dc7f4820a0a9b4fe1863213f8b3f3eec1332b48cd2dc0dd2b5cfae199cff8d181365598fb768c0e4e4d53902db3c2d571992b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fewerfloatpages-doc"

RDEPENDS:${PN} += ""

inherit rpm
