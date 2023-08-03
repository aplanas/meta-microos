SUMMARY = "Documentation for texlive-getfiledate"
DESCRIPTION = "This package includes the documentation for texlive-getfiledate"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn16189"

RPM_NAME = "texlive-getfiledate-doc-2023.209.1.2svn16189-53.1.noarch.rpm"
RPM_HASH = "b87254955f0d280d7c41dd40b40b49fd8ec32e55ae88ad2eb4f839670b0ac7608f7ffebc630985eae19720fc6b8c64ebcb1f826c28f6b51b990fb5bdb0435598"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-getfiledate-doc"

RDEPENDS:${PN} += ""

inherit rpm
