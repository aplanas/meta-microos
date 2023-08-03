SUMMARY = "Documentation for texlive-ucharclasses"
DESCRIPTION = "This package includes the documentation for texlive-ucharclasses"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.6svn64782"

RPM_NAME = "texlive-ucharclasses-doc-2023.209.2.6svn64782-54.1.noarch.rpm"
RPM_HASH = "679b050e55d8d46c685800404907a169e1e1bc69374fc5ec7e887cca1098f7fe9649577d934723bd9c306c758acfb37278cac285a04982a460775d7fdcbfe5ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ucharclasses-doc"

RDEPENDS:${PN} += ""

inherit rpm
