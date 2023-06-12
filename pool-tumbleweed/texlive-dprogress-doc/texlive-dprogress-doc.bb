SUMMARY = "Documentation for texlive-dprogress"
DESCRIPTION = "This package includes the documentation for texlive-dprogress"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-dprogress-doc-2023.201.0.0.1svn15878-52.1.noarch.rpm"
RPM_HASH = "7742b554933cf07332679af8667689d6c67e10683e4028dcee44fb70bc7c5ccad1924d543ea27267cbe3d0379b4262cc2b6f9a7f5058c6542006136651a3737c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dprogress-doc"
RDEPENDS:${PN} += ""

inherit rpm
