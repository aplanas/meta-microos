SUMMARY = "Documentation for texlive-bxdpx-beamer"
DESCRIPTION = "This package includes the documentation for texlive-bxdpx-beamer"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn41813"

RPM_NAME = "texlive-bxdpx-beamer-doc-2023.201.0.0.3svn41813-52.1.noarch.rpm"
RPM_HASH = "3792a8cf98a094234ad796f69879272c18108b70bdca8e2342dd853182f83757b6054316a09759709f3b41e4876264b876db71a2ceec87927055375854ff5333"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bxdpx-beamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
