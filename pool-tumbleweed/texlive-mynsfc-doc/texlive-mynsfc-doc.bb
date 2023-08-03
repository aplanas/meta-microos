SUMMARY = "Documentation for texlive-mynsfc"
DESCRIPTION = "This package includes the documentation for texlive-mynsfc"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.30svn60280"

RPM_NAME = "texlive-mynsfc-doc-2023.209.1.30svn60280-55.1.noarch.rpm"
RPM_HASH = "10e708cd9f160e4d825a8ef77ad425a5a67f90af5f0050a6ef22b5869f7f6ca929fc03654447d7040896d578c8b3e48810f01e14976d323072f238d4c1378f66"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mynsfc-doc"

RDEPENDS:${PN} += ""

inherit rpm
