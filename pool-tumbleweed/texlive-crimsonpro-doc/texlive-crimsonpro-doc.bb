SUMMARY = "Documentation for texlive-crimsonpro"
DESCRIPTION = "This package includes the documentation for texlive-crimsonpro"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64565"

RPM_NAME = "texlive-crimsonpro-doc-2023.209.svn64565-55.1.noarch.rpm"
RPM_HASH = "3c8a1a954067c0a724b9dc841fabd9f22e468b0ada40680a1d85dd8743292f30dc896bcd9287973134bebb9c7ae58e395864f7723bb5b7a2acaeb77efba42319"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crimsonpro-doc"

RDEPENDS:${PN} += ""

inherit rpm
