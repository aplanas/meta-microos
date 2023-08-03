SUMMARY = "Documentation for texlive-uafthesis"
DESCRIPTION = "This package includes the documentation for texlive-uafthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.12.12svn57349"

RPM_NAME = "texlive-uafthesis-doc-2023.209.12.12svn57349-53.1.noarch.rpm"
RPM_HASH = "6ccc01977184969d1eedf06d23010a2b2d43f71c6651e09eb5381272b76ff8146a9450f052d7dc42f0a47fac06647b92ab06aee534142a8c867d0385eb917a7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uafthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
