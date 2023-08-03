SUMMARY = "Documentation for texlive-varisize"
DESCRIPTION = "This package includes the documentation for texlive-varisize"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-varisize-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "34002fd48b3971468c40cbb5377be82a9087a8a1d43c336bdc4604008a4cb7352560af5be9f69d3fe76257093fe812adca902f009b58b7c4328e1c2efa9a04bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-varisize-doc"

RDEPENDS:${PN} += ""

inherit rpm
