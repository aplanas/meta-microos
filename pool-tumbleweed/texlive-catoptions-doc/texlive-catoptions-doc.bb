SUMMARY = "Documentation for texlive-catoptions"
DESCRIPTION = "This package includes the documentation for texlive-catoptions"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.7hsvn35069"

RPM_NAME = "texlive-catoptions-doc-2023.201.0.0.2.7hsvn35069-52.1.noarch.rpm"
RPM_HASH = "d40c27400143bab76d23b5b9d669ddea46a07ff18cecbeea89bb1bd2d0379775b1dbd941585b047af146719e87fcad342e37a7f0d8fc7237fd4b0a10ba2d330e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-catoptions-doc"

RDEPENDS:${PN} += ""

inherit rpm
