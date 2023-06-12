SUMMARY = "Documentation for texlive-mfpic"
DESCRIPTION = "This package includes the documentation for texlive-mfpic"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.10svn28444"

RPM_NAME = "texlive-mfpic-doc-2023.201.1.10svn28444-54.1.noarch.rpm"
RPM_HASH = "fcadedefc8a256cd41c5cd18f75980d3e7cac27e0fb8c5fcb358990ffa2b43a8181bec403ed07ac9cbabe53f0d3cd838f40fd61b38273abf682047c2e2f5c815"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-mfpic-doc:en) \
texlive-mfpic-doc"
RDEPENDS:${PN} += ""

inherit rpm
