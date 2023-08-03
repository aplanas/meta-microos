SUMMARY = "Documentation for texlive-graphics-cfg"
DESCRIPTION = "This package includes the documentation for texlive-graphics-cfg"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn41448"

RPM_NAME = "texlive-graphics-cfg-doc-2023.209.svn41448-54.1.noarch.rpm"
RPM_HASH = "8935c7553c7cfaa5a39875e09e06bc5991c6bfb571c581b6ff73c053353e40bd76e4cefe145b6c148b56fae7631799caa9bcc8f57d44b5b6d4cd6764c663860b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphics-cfg-doc"

RDEPENDS:${PN} += ""

inherit rpm
