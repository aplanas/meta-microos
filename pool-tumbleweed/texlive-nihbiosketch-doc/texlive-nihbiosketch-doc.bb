SUMMARY = "Documentation for texlive-nihbiosketch"
DESCRIPTION = "This package includes the documentation for texlive-nihbiosketch"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn54191"

RPM_NAME = "texlive-nihbiosketch-doc-2023.201.svn54191-54.1.noarch.rpm"
RPM_HASH = "2b5dca372b3dafb054500e3aea68480f7711599b5e56efe88009cacdfff2c7a3c21b87a3f8c20fa1af7bde454c6ddef4355902de861836239aa374cdd5033f28"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nihbiosketch-doc"
RDEPENDS:${PN} += ""

inherit rpm
