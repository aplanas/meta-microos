SUMMARY = "Documentation for texlive-tabstackengine"
DESCRIPTION = "This package includes the documentation for texlive-tabstackengine"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.10svn46848"

RPM_NAME = "texlive-tabstackengine-doc-2023.209.2.10svn46848-55.1.noarch.rpm"
RPM_HASH = "e873b81ef046e3573a4f057ac25aa7edf19505f4fd7d7c3983c5914ba30122b868ecfe48cffa1f33da61527a2a2fb1609e54024cb6b6a3bcacdfa7a0328b0e8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabstackengine-doc"

RDEPENDS:${PN} += ""

inherit rpm
