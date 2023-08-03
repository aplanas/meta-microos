SUMMARY = "Documentation for texlive-beamertheme-tcolorbox"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-tcolorbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5svn64387"

RPM_NAME = "texlive-beamertheme-tcolorbox-doc-2023.209.0.0.5svn64387-54.1.noarch.rpm"
RPM_HASH = "7615bf85471c130e8c8de04c0a78947c7541234f5965e11d18c85618cd2aa78bf18c195638cb552ccb0a45e25f300d06f67ad4cad0f130845f8ac2774856328e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-tcolorbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
