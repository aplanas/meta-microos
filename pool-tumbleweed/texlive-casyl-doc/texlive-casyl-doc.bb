SUMMARY = "Documentation for texlive-casyl"
DESCRIPTION = "This package includes the documentation for texlive-casyl"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.0svn15878"

RPM_NAME = "texlive-casyl-doc-2023.209.2.0svn15878-53.1.noarch.rpm"
RPM_HASH = "5ffc0174354c3153feec08a1f919f35adeed9a9fb3dc22f5532b1dd3adf497c2c6e951e56fdc706facf0121434e5aa03978ce1551164446c461a06283dae3579"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-casyl-doc"

RDEPENDS:${PN} += ""

inherit rpm
