SUMMARY = "Documentation for texlive-moderncv"
DESCRIPTION = "This package includes the documentation for texlive-moderncv"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3.1svn62128"

RPM_NAME = "texlive-moderncv-doc-2023.201.2.3.1svn62128-54.1.noarch.rpm"
RPM_HASH = "3c92b45af189b2d654a804211f2659c3f7e3194ae505fae128cf50ea4e78360c82279f4434005c55bdf2c2a7dd1e8eecdf3f240a7abacbd9015aefdc81832018"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moderncv-doc"
RDEPENDS:${PN} += ""

inherit rpm
