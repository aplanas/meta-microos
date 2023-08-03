SUMMARY = "Documentation for texlive-arabi-add"
DESCRIPTION = "This package includes the documentation for texlive-arabi-add"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn37709"

RPM_NAME = "texlive-arabi-add-doc-2023.209.1.0svn37709-55.1.noarch.rpm"
RPM_HASH = "f204ee4cce3b0b9f74717cc014ea473ddacfee5c4d197d288cb8ae4acf9077a1401ecf977f69263e8c98d7f364340814550c17357f67bba7915c1a0ed89d8951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-arabi-add-doc"

RDEPENDS:${PN} += ""

inherit rpm
