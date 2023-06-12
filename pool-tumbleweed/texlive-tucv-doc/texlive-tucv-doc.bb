SUMMARY = "Documentation for texlive-tucv"
DESCRIPTION = "This package includes the documentation for texlive-tucv"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn20680"

RPM_NAME = "texlive-tucv-doc-2023.201.1.0svn20680-52.1.noarch.rpm"
RPM_HASH = "bba44f6a83ff441db38ad308ec5d62c01ed59fbd0c9864e47cc3845a117d1804e2b54a185cfd54031c2ae26da183e61977b4b0b6870962d772e9939f3fb84309"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tucv-doc"
RDEPENDS:${PN} += ""

inherit rpm
