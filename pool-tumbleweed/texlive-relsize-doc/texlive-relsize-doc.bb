SUMMARY = "Documentation for texlive-relsize"
DESCRIPTION = "This package includes the documentation for texlive-relsize"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.4.1svn30707"

RPM_NAME = "texlive-relsize-doc-2023.201.4.1svn30707-53.1.noarch.rpm"
RPM_HASH = "d278b316c00cc28521519cd8549e2dab082b20d4996614c139bdfd1792f83424f7ce4ee79470a3cf8ae03ff4315c33e26e91e6e42d14e01407354606ec27dacb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-relsize-doc"
RDEPENDS:${PN} += ""

inherit rpm
