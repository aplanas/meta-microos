SUMMARY = "Documentation for texlive-ptex-fontmaps"
DESCRIPTION = "This package includes the documentation for texlive-ptex-fontmaps"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.20210625.0svn65953"

RPM_NAME = "texlive-ptex-fontmaps-doc-2023.201.20210625.0svn65953-53.1.noarch.rpm"
RPM_HASH = "cc398d7414234d86ea98c8e60f837cddf1384491093fdfabc49fd045f369e004c54a42c05469a640480f7f6ba5af7351859c0b3e677ab878e3d82fe7301fe20c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ptex-fontmaps-doc"

RDEPENDS:${PN} += ""

inherit rpm
