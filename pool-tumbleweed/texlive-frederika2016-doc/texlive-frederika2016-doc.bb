SUMMARY = "Documentation for texlive-frederika2016"
DESCRIPTION = "This package includes the documentation for texlive-frederika2016"
LICENSE = "OFL-1.1"

PV = "2023.201.1.000_2016_initial_releasesvn42157"

RPM_NAME = "texlive-frederika2016-doc-2023.201.1.000_2016_initial_releasesvn42157-52.1.noarch.rpm"
RPM_HASH = "8e1412135525efed4fba485b5a4e4c496cd46e5901cb6d593c7f76212cdcb2c050d51bc557fcd98581873fcc8edeff3a5701910cfada94d03dcc84ef43065102"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frederika2016-doc"

RDEPENDS:${PN} += ""

inherit rpm
