SUMMARY = "Documentation for texlive-tikz-feynhand"
DESCRIPTION = "This package includes the documentation for texlive-tikz-feynhand"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1.0svn51915"

RPM_NAME = "texlive-tikz-feynhand-doc-2023.209.1.1.0svn51915-53.1.noarch.rpm"
RPM_HASH = "dac48124d455bda186454efa319afcec5e2ab400fb7253e0e2a4e14d093652dcb3bfaf419af397dd4d1f9e53d14b4c31f73dc42f8e35381ef44d3d5ad1ba0c6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-feynhand-doc"

RDEPENDS:${PN} += ""

inherit rpm
