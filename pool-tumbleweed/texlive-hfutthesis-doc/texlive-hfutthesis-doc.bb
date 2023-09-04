SUMMARY = "Documentation for texlive-hfutthesis"
DESCRIPTION = "This package includes the documentation for texlive-hfutthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.4svn64025"

RPM_NAME = "texlive-hfutthesis-doc-2023.209.1.0.4svn64025-54.2.noarch.rpm"
RPM_HASH = "e83212ae1383bc8badd4fb3dce82d8fcd46a9aefe810ff172ebbc18b33bb0309c544bee6f56d563211546004cbdce51923cbd75d1c8c2a393c26801faec32095"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hfutthesis-doc-zh \
texlive-hfutthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
