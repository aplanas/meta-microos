SUMMARY = "Documentation for texlive-draftfigure"
DESCRIPTION = "This package includes the documentation for texlive-draftfigure"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn44854"

RPM_NAME = "texlive-draftfigure-doc-2023.209.0.0.2svn44854-53.1.noarch.rpm"
RPM_HASH = "fa9167744745b59020be0f6dfbd54ea95a4b62dfad81f1a3c70a7745dd0659056069ab2083a3dc35e78168c2bc6c4298eed62c09b3bbab522d2e4b488bce2f54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-draftfigure-doc"

RDEPENDS:${PN} += ""

inherit rpm
