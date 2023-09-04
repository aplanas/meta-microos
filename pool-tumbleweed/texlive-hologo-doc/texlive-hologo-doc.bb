SUMMARY = "Documentation for texlive-hologo"
DESCRIPTION = "This package includes the documentation for texlive-hologo"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.15svn61719"

RPM_NAME = "texlive-hologo-doc-2023.209.1.15svn61719-54.2.noarch.rpm"
RPM_HASH = "556fc663db9841eb6f94199396151bb0f8db6e37d01f7b49798ae815fc94942e8b83eb7bd5620a0b09b119cbe73cdf5e0b279ffdf4ff00074c780ddb1e474abb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hologo-doc"

RDEPENDS:${PN} += ""

inherit rpm
