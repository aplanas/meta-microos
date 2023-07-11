SUMMARY = "Documentation for texlive-resumecls"
DESCRIPTION = "This package includes the documentation for texlive-resumecls"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.1svn54815"

RPM_NAME = "texlive-resumecls-doc-2023.201.0.0.4.1svn54815-53.2.noarch.rpm"
RPM_HASH = "db719c6900e4a470c7d851f743f5008eb2446f28e28460e8db916446eed5659a90abe2ccf048e0fee41d2e40179b67afe1e798071f4d70fefc4f14a2ac362541"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-resumecls-doc"

RDEPENDS:${PN} += ""

inherit rpm
