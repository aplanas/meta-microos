SUMMARY = "Documentation for texlive-esk"
DESCRIPTION = "This package includes the documentation for texlive-esk"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.0svn18115"

RPM_NAME = "texlive-esk-doc-2023.201.1.0svn18115-53.2.noarch.rpm"
RPM_HASH = "bec402def16cce8c04091610cf8042c58af39ce97d167255caf75b07bf83f5a77920978d9bd3d3f792f5f1a4639ad50e0e213944c8fd3168ab003e4a4822a744"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-esk-doc"

RDEPENDS:${PN} += ""

inherit rpm
