SUMMARY = "Documentation for texlive-uafthesis"
DESCRIPTION = "This package includes the documentation for texlive-uafthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.12.12svn57349"

RPM_NAME = "texlive-uafthesis-doc-2023.201.12.12svn57349-52.1.noarch.rpm"
RPM_HASH = "a41deaa8fc8cfbcfaac53a7c53be8325810ef5a2d91fae4a54ba9333dce8dcbda01fdf595684db0bea900f294c3dc3280923c5c0e93bdf523fd2120d0fa30272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uafthesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
