SUMMARY = "Documentation for texlive-mathalpha"
DESCRIPTION = "This package includes the documentation for texlive-mathalpha"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.143svn61089"

RPM_NAME = "texlive-mathalpha-doc-2023.201.1.143svn61089-52.1.noarch.rpm"
RPM_HASH = "dc26b3b23e1c0d1acbe15a1795d6dcb3542c2719b49adeda674096b3b1b0b0779e9bbc7abdc14285cb9d4942b5240fd7ba6ba1204d3bb16effbdf3fdb93c1fe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathalpha-doc"

RDEPENDS:${PN} += ""

inherit rpm
