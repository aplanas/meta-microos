SUMMARY = "Documentation for texlive-beamerthemeamurmaple"
DESCRIPTION = "This package includes the documentation for texlive-beamerthemeamurmaple"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn65698"

RPM_NAME = "texlive-beamerthemeamurmaple-doc-2023.209.1.2svn65698-54.1.noarch.rpm"
RPM_HASH = "b052c79a8c628cac7027afd2697e84d61298adef4381267cca8470cf65e2bd666b21bdedeb0f99e771d4a603f8527a526159b0b82160d9c38eb107b5f5ebaf81"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamerthemeamurmaple-doc"

RDEPENDS:${PN} += ""

inherit rpm
