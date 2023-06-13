SUMMARY = "Documentation for texlive-qrbill"
DESCRIPTION = "This package includes the documentation for texlive-qrbill"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.00svn66301"

RPM_NAME = "texlive-qrbill-doc-2023.201.2.00svn66301-53.1.noarch.rpm"
RPM_HASH = "aea7506c7c9e16c41c3ccd9a6feeb479fcc3619aac558992f19a191d728f74cd52a8d71e1216b50f0c09efc1e6f7e64c2be7871cca1df33ab8d3d83446d0d5e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qrbill-doc"

RDEPENDS:${PN} += ""

inherit rpm
