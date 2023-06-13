SUMMARY = "Documentation for texlive-listofitems"
DESCRIPTION = "This package includes the documentation for texlive-listofitems"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.63svn51923"

RPM_NAME = "texlive-listofitems-doc-2023.201.1.63svn51923-54.1.noarch.rpm"
RPM_HASH = "c889d923bac2f1f4db6279758e8a4bdbcef2980b15df010a545bfb32fbdef464e07134d7c070725dc0b1c624034261ef70476d3510768fbb2a3c9df0f1fa8713"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-listofitems-doc:en;fr) \
texlive-listofitems-doc"

RDEPENDS:${PN} += ""

inherit rpm
