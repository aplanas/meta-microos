SUMMARY = "Documentation for texlive-spot"
DESCRIPTION = "This package includes the documentation for texlive-spot"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn22408"

RPM_NAME = "texlive-spot-doc-2023.201.1.1svn22408-57.1.noarch.rpm"
RPM_HASH = "33680896759e43fcdbc318213196734d7699ea909ed33dec6f14daa9bfa79e5e3443a4f15b55236fd2e67c942073b2d1e447ec86d62a922732601f793682f175"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spot-doc"
RDEPENDS:${PN} += ""

inherit rpm
