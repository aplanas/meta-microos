SUMMARY = "Documentation for texlive-writeongrid"
DESCRIPTION = "This package includes the documentation for texlive-writeongrid"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.2svn65700"

RPM_NAME = "texlive-writeongrid-doc-2023.201.0.0.1.2svn65700-52.2.noarch.rpm"
RPM_HASH = "3db238549b54e126027486a190ccb677e36dd9b3d1d51f330d18468570a7416d415f5fb27f21ae258722119b2b2651bb7bd21ad0543fa474acaed621c6120047"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-writeongrid-doc-fr \
texlive-writeongrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
