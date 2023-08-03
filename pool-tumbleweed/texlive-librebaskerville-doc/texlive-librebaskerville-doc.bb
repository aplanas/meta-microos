SUMMARY = "Documentation for texlive-librebaskerville"
DESCRIPTION = "This package includes the documentation for texlive-librebaskerville"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64421"

RPM_NAME = "texlive-librebaskerville-doc-2023.209.svn64421-55.1.noarch.rpm"
RPM_HASH = "e28344564a09e925f48e7996d9bb40eed0220cd3225f42822e03d1b8c5f573eab75dc699b2a6c7c30ec2bc1146a9871fee7fdb52d877a25e8f06c1f9a4c70542"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-librebaskerville-doc"

RDEPENDS:${PN} += ""

inherit rpm
