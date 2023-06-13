SUMMARY = "Documentation for texlive-tikz-feynhand"
DESCRIPTION = "This package includes the documentation for texlive-tikz-feynhand"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1.0svn51915"

RPM_NAME = "texlive-tikz-feynhand-doc-2023.201.1.1.0svn51915-52.1.noarch.rpm"
RPM_HASH = "17dbbeaa34d4b769686c8e26afbca02896e2faa285a4547b5259c0d9473bb319a274819b5e4d3d2eab21eafc870c71bf65f47436606f076a28c68db1a5ec400d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-feynhand-doc"

RDEPENDS:${PN} += ""

inherit rpm
