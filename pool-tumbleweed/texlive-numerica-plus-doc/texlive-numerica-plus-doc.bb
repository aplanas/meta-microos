SUMMARY = "Documentation for texlive-numerica-plus"
DESCRIPTION = "This package includes the documentation for texlive-numerica-plus"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0.0svn61289"

RPM_NAME = "texlive-numerica-plus-doc-2023.201.2.0.0svn61289-54.1.noarch.rpm"
RPM_HASH = "20cfdb9f2a0dd52df1d3e36055c1d24aea97c3b4db488af8ef726aea96926d4e3a0b0bf1cd1843720b8cbfc589cce91dbd3a47e0dcb45068c2f6e5978ae75232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-numerica-plus-doc"

RDEPENDS:${PN} += ""

inherit rpm
