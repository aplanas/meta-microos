SUMMARY = "Documentation for texlive-egameps"
DESCRIPTION = "This package includes the documentation for texlive-egameps"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-egameps-doc-2023.201.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "bea0c447b61c3a1e4b53a429ccafb9bef22f4e218bf44998f6fe298282abdc888f75a3e8dd51a04e3c7033a9a83f956195a11a7cb18d138028babc5001771a25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-egameps-doc"
RDEPENDS:${PN} += ""

inherit rpm
