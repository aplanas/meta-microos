SUMMARY = "Documentation for texlive-brushscr"
DESCRIPTION = "This package includes the documentation for texlive-brushscr"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn28363"

RPM_NAME = "texlive-brushscr-doc-2023.201.svn28363-52.1.noarch.rpm"
RPM_HASH = "4fe3c1840e374316a53e8b80a8a38fdbaf768b3b400d015d6db39021b6c81dbda051411c456e0e04d89ba4696faa8692bb6a6fafad75a32fba571abde6260a40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-brushscr-doc"
RDEPENDS:${PN} += ""

inherit rpm
