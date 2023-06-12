SUMMARY = "Documentation for texlive-gcard"
DESCRIPTION = "This package includes the documentation for texlive-gcard"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-gcard-doc-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "3196329b60793a90f710d08dd80b7c34c6b3e3c321463a3df2b4d373bc5564616118fd22edbf4b4646a7d54ec710872617e63ac6e713e205e76949507fdd8ff4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gcard-doc"
RDEPENDS:${PN} += ""

inherit rpm
