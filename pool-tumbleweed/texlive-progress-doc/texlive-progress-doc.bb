SUMMARY = "Documentation for texlive-progress"
DESCRIPTION = "This package includes the documentation for texlive-progress"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn19519"

RPM_NAME = "texlive-progress-doc-2023.209.1.10svn19519-53.1.noarch.rpm"
RPM_HASH = "d4f8e1465b82b57a2d0114d65be15b588de92c0f24b0f2e306107ac73802df8a0bb33bdaefb9cb4f8e46506f431efb4e46fc7948508fce2b87db2b60afb38118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-progress-doc"

RDEPENDS:${PN} += ""

inherit rpm
