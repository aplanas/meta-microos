SUMMARY = "Documentation for texlive-kixfont"
DESCRIPTION = "This package includes the documentation for texlive-kixfont"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn18488"

RPM_NAME = "texlive-kixfont-doc-2023.201.svn18488-55.1.noarch.rpm"
RPM_HASH = "0ecddc028329d6531ccf67df6d46592a3903e74637b568e536b998db5164802fd34549d95dbcfb56287394341189d3a789d75a6ec3e0f1ab64fcb988ba7f494b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kixfont-doc"
RDEPENDS:${PN} += ""

inherit rpm
