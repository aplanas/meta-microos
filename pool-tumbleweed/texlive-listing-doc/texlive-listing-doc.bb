SUMMARY = "Documentation for texlive-listing"
DESCRIPTION = "This package includes the documentation for texlive-listing"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn17373"

RPM_NAME = "texlive-listing-doc-2023.201.1.2svn17373-54.1.noarch.rpm"
RPM_HASH = "f7d9539bdbbbbd639b67526e004afe0cf064b30747cd6a6348141fa3462ad68435632da98a99e00de1443c171ee0d0858d44830babeee2c4d76bf2762892f752"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listing-doc"
RDEPENDS:${PN} += ""

inherit rpm
