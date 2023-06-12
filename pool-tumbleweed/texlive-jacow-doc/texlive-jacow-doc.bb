SUMMARY = "Documentation for texlive-jacow"
DESCRIPTION = "This package includes the documentation for texlive-jacow"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn63060"

RPM_NAME = "texlive-jacow-doc-2023.201.2.7svn63060-55.1.noarch.rpm"
RPM_HASH = "17fa10cc7a1bb715510e58d5099f2cfbfd31f66c925e035304e318091d7b70ba6cf1a7835cbe8a3fd7e87b1849a25cd3d396cad0bf9384e82afaa741e2341bea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jacow-doc"
RDEPENDS:${PN} += ""

inherit rpm
