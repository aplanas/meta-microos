SUMMARY = "Documentation for texlive-modeles-factures-belges-assocs"
DESCRIPTION = "This package includes the documentation for texlive-modeles-factures-belges-assocs"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn50010"

RPM_NAME = "texlive-modeles-factures-belges-assocs-doc-2023.209.1.0.1svn50010-55.1.noarch.rpm"
RPM_HASH = "f2649fd64fe60bb29d4e269cec306b87967eadc511bfa4b2513826cc13eef5ed4455f3447f626185a2389a6df1379c31ace417b2aa0bb581bdc36bc310480afc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-modeles-factures-belges-assocs-doc"

RDEPENDS:${PN} += ""

inherit rpm
