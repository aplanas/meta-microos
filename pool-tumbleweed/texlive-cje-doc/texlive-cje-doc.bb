SUMMARY = "Documentation for texlive-cje"
DESCRIPTION = "This package includes the documentation for texlive-cje"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn46721"

RPM_NAME = "texlive-cje-doc-2023.201.1.06svn46721-53.1.noarch.rpm"
RPM_HASH = "34249abb50f44793c4ab0b09c4d7087a9e1fe7ae94429396059b6c0e5dae1c42344a189a2aa8801749e1c583cc2878a3f263d5595dcc226b1630cd7a379c626c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cje-doc"

RDEPENDS:${PN} += ""

inherit rpm
