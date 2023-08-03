SUMMARY = "Documentation for texlive-cbcoptic"
DESCRIPTION = "This package includes the documentation for texlive-cbcoptic"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn16666"

RPM_NAME = "texlive-cbcoptic-doc-2023.209.0.0.2svn16666-53.1.noarch.rpm"
RPM_HASH = "b55f6a7a59761ac4d7b07a8e28ff15f66e26bd44e150f7ff4a1e3050fe7d4d3d8e0e3a817c58f634d69b254479e9ac1a7e864fae9db56b2a8a99e3dfe340ba43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cbcoptic-doc"

RDEPENDS:${PN} += ""

inherit rpm
