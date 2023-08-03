SUMMARY = "Documentation for texlive-afm2pl"
DESCRIPTION = "This package includes the documentation for texlive-afm2pl"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-afm2pl-doc-2023.209.svn66186-55.1.noarch.rpm"
RPM_HASH = "8c7cee795983812cf0d185ab8e3ec885b80982d722b579df6e24b8ef9351ed76c4d11f2c72b8b4736216a34e05758a0c6f304bd45d6d2ae11a9d603a49db15e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-afm2pl.1 \
texlive-afm2pl-doc"

RDEPENDS:${PN} += ""

inherit rpm
