SUMMARY = "Documentation for texlive-zed-csp"
DESCRIPTION = "This package includes the documentation for texlive-zed-csp"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17258"

RPM_NAME = "texlive-zed-csp-doc-2023.201.svn17258-52.2.noarch.rpm"
RPM_HASH = "c26e3e23062c40e5f2492ce7e566e10580e134c301e04fb9c26c0f1fd671bf36f1acce3f3021261ca03fa5293d188fb1095127cbe64d671bb46108ceea7773de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zed-csp-doc"

RDEPENDS:${PN} += ""

inherit rpm
