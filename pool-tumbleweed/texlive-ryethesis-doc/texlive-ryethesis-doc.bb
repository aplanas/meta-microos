SUMMARY = "Documentation for texlive-ryethesis"
DESCRIPTION = "This package includes the documentation for texlive-ryethesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.36svn33945"

RPM_NAME = "texlive-ryethesis-doc-2023.209.1.36svn33945-54.1.noarch.rpm"
RPM_HASH = "032b5ba5e062441ddeee5033f81bfea3a176031fcd817798b1cb3ae837b3cac04044f3f2334f41f8b41e13d7f32274a0ff98f62a879aebc12c10c3e5863b5bf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ryethesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
