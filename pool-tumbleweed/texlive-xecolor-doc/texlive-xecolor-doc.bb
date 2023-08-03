SUMMARY = "Documentation for texlive-xecolor"
DESCRIPTION = "This package includes the documentation for texlive-xecolor"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn29660"

RPM_NAME = "texlive-xecolor-doc-2023.209.0.0.1svn29660-53.1.noarch.rpm"
RPM_HASH = "8c8bf10fbcdf27e739d3791c5b7f8c0fe0a4792d0944a53ca82a80cbe3c1787805de9853e56e191df3476284347015da42a1e2a7fab0fe16c30d46d1273ace4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xecolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
