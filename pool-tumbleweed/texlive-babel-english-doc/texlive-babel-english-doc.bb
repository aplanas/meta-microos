SUMMARY = "Documentation for texlive-babel-english"
DESCRIPTION = "This package includes the documentation for texlive-babel-english"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.3rsvn44495"

RPM_NAME = "texlive-babel-english-doc-2023.209.3.3rsvn44495-54.1.noarch.rpm"
RPM_HASH = "475bdb49723a125cce9d488de48bc083c557bd7974d3763fb8fefb19f3d5f8486ae4a6fc911172f4519088d1533002050cad16d9ccf2fb0eccc6b3aafc17ea13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-english-doc"

RDEPENDS:${PN} += ""

inherit rpm
