SUMMARY = "Documentation for texlive-inputnormalization"
DESCRIPTION = "This package includes the documentation for texlive-inputnormalization"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2svn59850"

RPM_NAME = "texlive-inputnormalization-doc-2023.208.0.0.2svn59850-53.1.noarch.rpm"
RPM_HASH = "1952b7b6b8ac194acc313e8987d40280b3c6abf9fec85ac7cc0a38f7301a5364ac0efdf56cc58e8e0db82ef76a26661a26536e50ffa1b8bee1a9f6f563b43180"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inputnormalization-doc"

RDEPENDS:${PN} += ""

inherit rpm
