SUMMARY = "Documentation for texlive-xpunctuate"
DESCRIPTION = "This package includes the documentation for texlive-xpunctuate"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn26641"

RPM_NAME = "texlive-xpunctuate-doc-2023.201.1.0svn26641-52.2.noarch.rpm"
RPM_HASH = "3443d73592b0309ceaa7d3750e9efcc62f935ccd800f5f66218e044fe2c46b14a9c18230fb944ed2f2d52c3c5ce3d41809e5cc6adc491fd187d33ae1e04d8267"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xpunctuate-doc"

RDEPENDS:${PN} += ""

inherit rpm
