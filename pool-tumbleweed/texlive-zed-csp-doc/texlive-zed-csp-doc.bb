SUMMARY = "Documentation for texlive-zed-csp"
DESCRIPTION = "This package includes the documentation for texlive-zed-csp"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn17258"

RPM_NAME = "texlive-zed-csp-doc-2023.209.svn17258-53.2.noarch.rpm"
RPM_HASH = "037399969cf6439ecf55c5480eebf256f328c713509891f5cce6a01d989dabdc94adcd088a0bc18c1cc53b6e0fea44f0aca82c464235cd20351b8dc0a421065a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zed-csp-doc"

RDEPENDS:${PN} += ""

inherit rpm
