SUMMARY = "Documentation for texlive-jieeetran"
DESCRIPTION = "This package includes the documentation for texlive-jieeetran"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.19svn65642"

RPM_NAME = "texlive-jieeetran-doc-2023.209.0.0.19svn65642-56.1.noarch.rpm"
RPM_HASH = "e86e39e41df10c8e11197b96e886c4aa3b0e054618d0960f430055e71b36ffbd730d4757d04c9479963fb221818d7af583cbd19235f74751bceb6f74b27a8678"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-jieeetran-doc-ja \
texlive-jieeetran-doc"

RDEPENDS:${PN} += ""

inherit rpm
