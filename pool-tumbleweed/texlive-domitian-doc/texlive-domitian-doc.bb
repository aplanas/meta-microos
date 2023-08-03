SUMMARY = "Documentation for texlive-domitian"
DESCRIPTION = "This package includes the documentation for texlive-domitian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn55286"

RPM_NAME = "texlive-domitian-doc-2023.209.1.0.1svn55286-53.1.noarch.rpm"
RPM_HASH = "dbcf1d97a6002096493bfe83484afd851c9946bd9578e48f69992e20385f35699f06d92ee6c406c8d932dd0c9f29e0af2ddff6b222ca4aa14f95280383048ecc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-domitian-doc"

RDEPENDS:${PN} += ""

inherit rpm
