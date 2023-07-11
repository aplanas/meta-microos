SUMMARY = "Documentation for texlive-gmverse"
DESCRIPTION = "This package includes the documentation for texlive-gmverse"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.73svn29803"

RPM_NAME = "texlive-gmverse-doc-2023.201.0.0.73svn29803-53.2.noarch.rpm"
RPM_HASH = "2ccbab3557a407e566be52e07dda85de6aa00b22eb8ac3e3625b35509f75a7d2cd950c22c83844f8147b1119ee6bfadda0d6a0c523125e4bb14e6ed080f1029a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gmverse-doc"

RDEPENDS:${PN} += ""

inherit rpm
