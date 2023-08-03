SUMMARY = "Documentation for texlive-pst-3dplot"
DESCRIPTION = "This package includes the documentation for texlive-pst-3dplot"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.07asvn61615"

RPM_NAME = "texlive-pst-3dplot-doc-2023.209.2.07asvn61615-53.1.noarch.rpm"
RPM_HASH = "4bbf2e3f6a1ea555041399678a07292b4eda2329809fff6fbf0a7c61e82e6d0a5bce6e9384452ead94fa5965f705247bae88018c3044dbb17aa4ed9de6589f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-3dplot-doc"

RDEPENDS:${PN} += ""

inherit rpm
