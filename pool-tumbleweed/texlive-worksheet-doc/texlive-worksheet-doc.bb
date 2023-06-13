SUMMARY = "Documentation for texlive-worksheet"
DESCRIPTION = "This package includes the documentation for texlive-worksheet"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48423"

RPM_NAME = "texlive-worksheet-doc-2023.201.1.1svn48423-53.1.noarch.rpm"
RPM_HASH = "38ec9ee80cc8982f71cf0c0c998ee6988f7ceab077c1847c7710fefd53aa4b53c2ed2a0df8a740fb9f84a64efa95fae046941f0317d2b6e3b0b705c79f87c6fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-worksheet-doc"

RDEPENDS:${PN} += ""

inherit rpm
