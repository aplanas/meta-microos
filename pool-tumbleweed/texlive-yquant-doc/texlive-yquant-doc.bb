SUMMARY = "Documentation for texlive-yquant"
DESCRIPTION = "This package includes the documentation for texlive-yquant"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7.3svn65933"

RPM_NAME = "texlive-yquant-doc-2023.201.0.0.7.3svn65933-52.1.noarch.rpm"
RPM_HASH = "4f90e7d8824a7881746436b30f61f80405e7aeac14110c2aaf7fcfbdfb1849f830b4e25e86df018a8ca3a447b811a9cea3c9189e272010c00f8944d8ee876f95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yquant-doc"

RDEPENDS:${PN} += ""

inherit rpm
