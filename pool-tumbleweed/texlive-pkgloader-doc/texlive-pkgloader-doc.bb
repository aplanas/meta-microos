SUMMARY = "Documentation for texlive-pkgloader"
DESCRIPTION = "This package includes the documentation for texlive-pkgloader"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7.0svn47486"

RPM_NAME = "texlive-pkgloader-doc-2023.209.0.0.7.0svn47486-52.1.noarch.rpm"
RPM_HASH = "8fe11619aad25b3d90a0c33574dfb4e22e59f08192785302f11f108b5ea3109fc3c03c3f55aaa927ea1892ad468ed8b9fb41b2b398abd124a0025c25a8e75755"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pkgloader-doc"

RDEPENDS:${PN} += ""

inherit rpm
