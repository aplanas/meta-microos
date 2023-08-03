SUMMARY = "Documentation for texlive-exsol"
DESCRIPTION = "This package includes the documentation for texlive-exsol"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn48977"

RPM_NAME = "texlive-exsol-doc-2023.209.1.4svn48977-53.1.noarch.rpm"
RPM_HASH = "2d4682c6a2e8938a30e9d1dc2fcd1811cbcd9897fd23a24737b76edd07fdd1413a7fd292605570430f1b7d1baed3eab6695ccee09be206fe7dd6af83c5be6341"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-exsol-doc"

RDEPENDS:${PN} += ""

inherit rpm
