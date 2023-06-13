SUMMARY = "Documentation for texlive-uothesis"
DESCRIPTION = "This package includes the documentation for texlive-uothesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.5.6svn25355"

RPM_NAME = "texlive-uothesis-doc-2023.201.2.5.6svn25355-53.1.noarch.rpm"
RPM_HASH = "853bfd9a7e920ea19990e3265f76ca2ce93b3037d4a42830daf68010b58cde31a46b620d92c631ce15c6f958979cbca0f6604869eb4a0786e8c4f9933f28099b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uothesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
