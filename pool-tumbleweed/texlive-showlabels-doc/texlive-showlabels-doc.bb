SUMMARY = "Documentation for texlive-showlabels"
DESCRIPTION = "This package includes the documentation for texlive-showlabels"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.2svn63940"

RPM_NAME = "texlive-showlabels-doc-2023.209.1.9.2svn63940-54.1.noarch.rpm"
RPM_HASH = "985b6410816a56954924f25758df99d7678d823e3da3891d3d2ff986c60bc94b8bc2016c7eb3bce82475ed6da942af6794b1a69fb52cc7a4dd8993860fe228a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showlabels-doc"

RDEPENDS:${PN} += ""

inherit rpm
