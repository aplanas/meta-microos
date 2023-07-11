SUMMARY = "Documentation for texlive-dyntree"
DESCRIPTION = "This package includes the documentation for texlive-dyntree"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-dyntree-doc-2023.201.1.0svn15878-53.2.noarch.rpm"
RPM_HASH = "ffb473c534c41491a0317a65bedd74d9150f4c34534ef2649f8dc183f722e6e67c6ef5d0e058caf04c56bc61211840c29efdf770d7605ef95b76819b27f9c567"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dyntree-doc"

RDEPENDS:${PN} += ""

inherit rpm
