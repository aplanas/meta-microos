SUMMARY = "Documentation for texlive-utf8mex"
DESCRIPTION = "This package includes the documentation for texlive-utf8mex"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-utf8mex-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "3f311a2cd4e79700dcc89d7c3b2da8b9251b2a0b08ad70db758a8a11721ef6f7b76290f55d23fa6a8c108c438541e82da2e0fc47aa60663ad8509b2f1118c876"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-utf8mex-doc"
RDEPENDS:${PN} += ""

inherit rpm
