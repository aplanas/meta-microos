SUMMARY = "Documentation for texlive-titlepic"
DESCRIPTION = "This package includes the documentation for texlive-titlepic"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.2svn43497"

RPM_NAME = "texlive-titlepic-doc-2023.209.1.2svn43497-53.1.noarch.rpm"
RPM_HASH = "4608f91c30c04dd41ff7f23150e51e65adfde765140361912a7f60980227225844c977913e75cc693846d1b39f16fe1d2eaef17cc50c26fbc9cfdc0e19613ff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-titlepic-doc"

RDEPENDS:${PN} += ""

inherit rpm
