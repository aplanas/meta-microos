SUMMARY = "Documentation for texlive-lastpackage"
DESCRIPTION = "This package includes the documentation for texlive-lastpackage"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn34481"

RPM_NAME = "texlive-lastpackage-doc-2023.209.0.0.1svn34481-56.1.noarch.rpm"
RPM_HASH = "ea420d8d56ee7340faa15b8d1077fb1795b626ecf78816efae1a820b4860f3fba913fef1dbc589f674c489059b588c468b3dca95a81845253a44f240c0af0237"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lastpackage-doc"

RDEPENDS:${PN} += ""

inherit rpm
