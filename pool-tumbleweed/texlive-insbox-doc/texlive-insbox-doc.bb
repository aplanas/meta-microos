SUMMARY = "Documentation for texlive-insbox"
DESCRIPTION = "This package includes the documentation for texlive-insbox"
LICENSE = "SUSE-Public-Domain"

PV = "2023.208.2.2svn34299"

RPM_NAME = "texlive-insbox-doc-2023.208.2.2svn34299-53.1.noarch.rpm"
RPM_HASH = "ecb3fc6d196876cc6ef922d6bab9b7a63fcb6834979b092394fc77326a83abf2f7539856e3658aad71ea69e8e7b949b38599ccb6c1ebbc2a4100dbee62f7567c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-insbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
