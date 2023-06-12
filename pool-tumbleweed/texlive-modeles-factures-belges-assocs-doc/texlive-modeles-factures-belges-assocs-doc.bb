SUMMARY = "Documentation for texlive-modeles-factures-belges-assocs"
DESCRIPTION = "This package includes the documentation for texlive-modeles-factures-belges-assocs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn50010"

RPM_NAME = "texlive-modeles-factures-belges-assocs-doc-2023.201.1.0.1svn50010-54.1.noarch.rpm"
RPM_HASH = "d84120275ac2d7bc9f49ad9f3d4258c397c2daa80365920f8625a18fd431ebf4faba19eb55b6fa35752db795ddc59f34c84782ac134fb8e641586d7fdb3af0e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modeles-factures-belges-assocs-doc"
RDEPENDS:${PN} += ""

inherit rpm
