SUMMARY = "Documentation for texlive-atendofenv"
DESCRIPTION = "This package includes the documentation for texlive-atendofenv"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.0.0.2svn62164"

RPM_NAME = "texlive-atendofenv-doc-2023.201.0.0.2svn62164-53.1.noarch.rpm"
RPM_HASH = "22a2149dfd6e73599188d001f00544ef67ecdd0622ef49ec01412121a0c5af98c78e84731f3fcd8fdb73ae097a1cbcbc405110689707af32cfd66a9fc4ea6c05"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-atendofenv-doc"
RDEPENDS:${PN} += ""

inherit rpm
