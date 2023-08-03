SUMMARY = "Documentation for texlive-beilstein"
DESCRIPTION = "This package includes the documentation for texlive-beilstein"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn56193"

RPM_NAME = "texlive-beilstein-doc-2023.209.2.1svn56193-54.1.noarch.rpm"
RPM_HASH = "2d0cc88b461aa9f655a32ae53a4aaf96e9d62c1759d0b92f5591b1f26a45c4c0f9067836b701f378ad9dd802710591bda43c14f1a73de8820396b2a11cb7edbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beilstein-doc"

RDEPENDS:${PN} += ""

inherit rpm
