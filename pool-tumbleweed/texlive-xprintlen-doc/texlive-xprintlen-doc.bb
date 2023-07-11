SUMMARY = "Documentation for texlive-xprintlen"
DESCRIPTION = "This package includes the documentation for texlive-xprintlen"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35928"

RPM_NAME = "texlive-xprintlen-doc-2023.201.1.0svn35928-52.2.noarch.rpm"
RPM_HASH = "4f8d86d15455ecbb6596456481451407fd49c060c1d959d1fb3b8123137943782c34cd501410eb101664ce52a2468ae995ac47cb2f29fdad5e0b3f4617083bb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xprintlen-doc"

RDEPENDS:${PN} += ""

inherit rpm
