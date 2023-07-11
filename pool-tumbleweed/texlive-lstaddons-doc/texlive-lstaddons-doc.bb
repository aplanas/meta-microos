SUMMARY = "Documentation for texlive-lstaddons"
DESCRIPTION = "This package includes the documentation for texlive-lstaddons"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1svn64967"

RPM_NAME = "texlive-lstaddons-doc-2023.208.0.0.1svn64967-53.1.noarch.rpm"
RPM_HASH = "1cc1c780e6dc62b2712d4f913c313c02693679c251bbb5e21df7b5d9f47626ba6b7931aff2365732adc9a44cffd764004da88e76ab5845b89f743234406bef6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lstaddons-doc"

RDEPENDS:${PN} += ""

inherit rpm
