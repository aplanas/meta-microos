SUMMARY = "Documentation for texlive-sidenotesplus"
DESCRIPTION = "This package includes the documentation for texlive-sidenotesplus"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn63867"

RPM_NAME = "texlive-sidenotesplus-doc-2023.209.1.02svn63867-54.1.noarch.rpm"
RPM_HASH = "fb3cb06624285422bf67a4e7d827745fd3d0957983ae0194f6421a4ae513c3e20e02a50f7839586bb9656e9a9e3b8732bfdb43c6b1e426c9d107c66bff85e2d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sidenotesplus-doc"

RDEPENDS:${PN} += ""

inherit rpm
