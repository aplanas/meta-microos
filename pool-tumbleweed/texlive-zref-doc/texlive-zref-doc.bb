SUMMARY = "Documentation for texlive-zref"
DESCRIPTION = "This package includes the documentation for texlive-zref"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.34svn62977"

RPM_NAME = "texlive-zref-doc-2023.201.2.34svn62977-52.2.noarch.rpm"
RPM_HASH = "c80af490b89ee3168c7f8cb3ef1373b155bcaa99e27d796f2363b022f71594d29272f82de75186416d950367d0145e5782c40f927a46b72a8a698cfdf48d24df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zref-doc"

RDEPENDS:${PN} += ""

inherit rpm
