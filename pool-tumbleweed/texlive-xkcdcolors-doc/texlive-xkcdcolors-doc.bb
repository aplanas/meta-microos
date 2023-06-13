SUMMARY = "Documentation for texlive-xkcdcolors"
DESCRIPTION = "This package includes the documentation for texlive-xkcdcolors"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn54512"

RPM_NAME = "texlive-xkcdcolors-doc-2023.201.1.0.1svn54512-52.1.noarch.rpm"
RPM_HASH = "e154606e2326b0a72229f5c5f4238f061b223ccb7d474a1658969802fd7a4999aaf712fc117270840c17bece569127dc016346f5c767987f8ca1013ae28714ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xkcdcolors-doc"

RDEPENDS:${PN} += ""

inherit rpm
