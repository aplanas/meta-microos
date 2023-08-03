SUMMARY = "Documentation for texlive-dirtytalk"
DESCRIPTION = "This package includes the documentation for texlive-dirtytalk"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn20520"

RPM_NAME = "texlive-dirtytalk-doc-2023.209.1.0svn20520-53.1.noarch.rpm"
RPM_HASH = "7474835c9831d14091361023fbee05fcbd9fe341862f8326852d57a347e9b39e3e9ae686b93412203c7c5bfae1f01e544ba34937dda883ff676562e9f60fd0f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dirtytalk-doc"

RDEPENDS:${PN} += ""

inherit rpm
