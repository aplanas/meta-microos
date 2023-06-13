SUMMARY = "Documentation for texlive-units"
DESCRIPTION = "This package includes the documentation for texlive-units"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.9bsvn42428"

RPM_NAME = "texlive-units-doc-2023.201.0.0.9bsvn42428-53.1.noarch.rpm"
RPM_HASH = "90db233a0f2393e315e9ee943ec75250d580c2818319bee860933af39c9ca97504af3fca4fe72e678f7a712bde5a78254bb3ce6628c052b649934d6e29e11129"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-units-doc"

RDEPENDS:${PN} += ""

inherit rpm
