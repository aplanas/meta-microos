SUMMARY = "Documentation for texlive-tuda-ci"
DESCRIPTION = "This package includes the documentation for texlive-tuda-ci"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.29svn65254"

RPM_NAME = "texlive-tuda-ci-doc-2023.209.3.29svn65254-53.1.noarch.rpm"
RPM_HASH = "f50b1aae143af8f5a80e433c6c410acb857aa28fd6d53c61f70936cbf9a685826a95f72485fd07c1737812e10fb1ef17a8a88dcee1b61467ad46d455c0cd966c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-tuda-ci-doc-de \
texlive-tuda-ci-doc"

RDEPENDS:${PN} += ""

inherit rpm
