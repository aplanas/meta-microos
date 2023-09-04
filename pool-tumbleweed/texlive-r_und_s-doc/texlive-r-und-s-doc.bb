SUMMARY = "Documentation for texlive-r_und_s"
DESCRIPTION = "This package includes the documentation for texlive-r_und_s"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3isvn15878"

RPM_NAME = "texlive-r_und_s-doc-2023.209.1.3isvn15878-54.2.noarch.rpm"
RPM_HASH = "db791ff5ac6caed831d81d1652246ce1021f7cd47dfd78dfe9a1c8c67466d6ece91a5f15c7e5ffe5b4df88279bd223e617254018f48792ab0c33010d9cf91733"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-r-und-s-doc"

RDEPENDS:${PN} += ""

inherit rpm
