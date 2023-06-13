SUMMARY = "Documentation for texlive-soup"
DESCRIPTION = "This package includes the documentation for texlive-soup"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.2svn50815"

RPM_NAME = "texlive-soup-doc-2023.201.1.0.2svn50815-57.1.noarch.rpm"
RPM_HASH = "11a89ba8718bc730d65a89c03b89aeccd271e2fff05ce5d95f813475090a39f0d30bdee9c2513920f2f2b0861d589a6a5b428e7fa628181e5ae037bbca38412f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-soup-doc"

RDEPENDS:${PN} += ""

inherit rpm
