SUMMARY = "Documentation for texlive-din1505"
DESCRIPTION = "This package includes the documentation for texlive-din1505"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn19441"

RPM_NAME = "texlive-din1505-doc-2023.209.svn19441-53.1.noarch.rpm"
RPM_HASH = "3d52071c1541bb8b23d0c6786d2579ba02d4aec80a86375e40dfc18a03cbc4f578d8155f30fbd1bfaba85cce39c6c224b94500e02a1539291689cfe057ec035c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-din1505-doc"

RDEPENDS:${PN} += ""

inherit rpm
