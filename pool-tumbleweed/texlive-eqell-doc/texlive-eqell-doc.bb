SUMMARY = "Documentation for texlive-eqell"
DESCRIPTION = "This package includes the documentation for texlive-eqell"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn22931"

RPM_NAME = "texlive-eqell-doc-2023.201.svn22931-53.2.noarch.rpm"
RPM_HASH = "fda10dd695885df9b45c737b4688a16424a4e380d67233f36cb668b65185948697b2f7400b601cc2190c24a70828884a2deb5d8c8e527fd8ceccda38017ea032"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqell-doc"

RDEPENDS:${PN} += ""

inherit rpm
