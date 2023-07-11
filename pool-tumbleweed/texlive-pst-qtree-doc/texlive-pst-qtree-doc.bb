SUMMARY = "Documentation for texlive-pst-qtree"
DESCRIPTION = "This package includes the documentation for texlive-pst-qtree"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-pst-qtree-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "9718d0f6352e641fd913c5187c1d1701d2eccc9c8c76ac18b5f6ad9b66190dd3ba89d572e1acaf3fedff0a0ba518b19ff818d862cb44a5dbdd227ff327c69249"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-qtree-doc"

RDEPENDS:${PN} += ""

inherit rpm
