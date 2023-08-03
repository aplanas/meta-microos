SUMMARY = "Documentation for texlive-gsemthesis"
DESCRIPTION = "This package includes the documentation for texlive-gsemthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9.4svn56291"

RPM_NAME = "texlive-gsemthesis-doc-2023.209.0.0.9.4svn56291-54.1.noarch.rpm"
RPM_HASH = "f3acd185e7f11fe2ce7d19c4db7e4f2d7ffc8599ecd0479f0dada269dab5da3dca5ed7dced40780e868b292a60b38e8394eeb9a04d353284c270a6d54b394512"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gsemthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
