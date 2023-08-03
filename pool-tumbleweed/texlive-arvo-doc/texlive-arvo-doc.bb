SUMMARY = "Documentation for texlive-arvo"
DESCRIPTION = "This package includes the documentation for texlive-arvo"
LICENSE = "OFL-1.1"

PV = "2023.209.svn57213"

RPM_NAME = "texlive-arvo-doc-2023.209.svn57213-54.1.noarch.rpm"
RPM_HASH = "f1d6aa9ec5385bb4850148ec6a7b8295e8bfa503b5cc1bbc12752b47a2c511b179d54dc9670ba9c8d6cadc23e025e5ff615f54a6de9d93a3e22dc6fd6e4cb6a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arvo-doc"

RDEPENDS:${PN} += ""

inherit rpm
