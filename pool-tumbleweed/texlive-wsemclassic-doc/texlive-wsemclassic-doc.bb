SUMMARY = "Documentation for texlive-wsemclassic"
DESCRIPTION = "This package includes the documentation for texlive-wsemclassic"
LICENSE = "BSD-3-Clause"

PV = "2023.209.1.0.1svn31532"

RPM_NAME = "texlive-wsemclassic-doc-2023.209.1.0.1svn31532-53.2.noarch.rpm"
RPM_HASH = "4eb27d461211e559ca0cd4fc1ee30ac5ea3dafa57384045febfd621042e0c08f1f25a0d4a8252517386eca1c69958eff4b48dbc27f4873f2eddbb79c0cb86e6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-wsemclassic-doc"

RDEPENDS:${PN} += ""

inherit rpm
