SUMMARY = "Documentation for texlive-pagelayout"
DESCRIPTION = "This package includes the documentation for texlive-pagelayout"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.4svn66392"

RPM_NAME = "texlive-pagelayout-doc-2023.209.1.0.4svn66392-52.1.noarch.rpm"
RPM_HASH = "012e76f107f82c5ef05df458e4d2df6ea2319f0135417259ebb66ca0d0e72bb46ac0340b0a0f6129c541788317ee7b8e6da83e47d8ef070cb3aea9d170d1502b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pagelayoutapi.1 \
man-textestvis.1 \
texlive-pagelayout-doc"

RDEPENDS:${PN} += ""

inherit rpm
