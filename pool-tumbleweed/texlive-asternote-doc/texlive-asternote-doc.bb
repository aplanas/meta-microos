SUMMARY = "Documentation for texlive-asternote"
DESCRIPTION = "This package includes the documentation for texlive-asternote"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn63838"

RPM_NAME = "texlive-asternote-doc-2023.201.1.1svn63838-53.1.noarch.rpm"
RPM_HASH = "665e623e38ec5aa8b5a0fadf08f018ca37ff12b1e1752c3533088a663180f71947ae15ea3a6f0517e5bcb3372adcfb169c0a5155df77bafa49eeec3ab879741e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ja) \
locale(texlive-asternote-doc:en \
texlive-asternote-doc"
RDEPENDS:${PN} += ""

inherit rpm
