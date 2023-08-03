SUMMARY = "Documentation for texlive-beamertheme-simpleplus"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-simpleplus"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn64770"

RPM_NAME = "texlive-beamertheme-simpleplus-doc-2023.209.1.0svn64770-54.1.noarch.rpm"
RPM_HASH = "ee69050bdaca4944ebca27a80771010901baeee8e67789035c011c6d7d1f68dcd34c25af3bde1cb9b649db434389c51c6de035dd11dfe93010884e873e203bab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-simpleplus-doc"

RDEPENDS:${PN} += ""

inherit rpm
