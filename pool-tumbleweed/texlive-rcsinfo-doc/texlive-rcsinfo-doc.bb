SUMMARY = "Documentation for texlive-rcsinfo"
DESCRIPTION = "This package includes the documentation for texlive-rcsinfo"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.11svn15878"

RPM_NAME = "texlive-rcsinfo-doc-2023.209.1.11svn15878-54.2.noarch.rpm"
RPM_HASH = "6fbfdbb6109ae42fd724d0f256efc944ddc5b6dd674929e0d8d32b1a0ccf71f3d3529846138b6ba924e366c569dd1aa50dd4fa8716ca124f153a23a4d9f16753"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rcsinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
