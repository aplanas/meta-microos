SUMMARY = "Documentation for texlive-beamertheme-light"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-light"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn49867"

RPM_NAME = "texlive-beamertheme-light-doc-2023.209.1.0svn49867-54.1.noarch.rpm"
RPM_HASH = "3a489300403d772bd1edea0789f884828294891a8941b0512736fd54794889fc11fbc031732a8b9ac8fcc4592ddabb3dbee07188f9b95f8687418ea324ef4045"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-light-doc"

RDEPENDS:${PN} += ""

inherit rpm
