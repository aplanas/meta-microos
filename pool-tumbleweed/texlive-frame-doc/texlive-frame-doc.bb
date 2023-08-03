SUMMARY = "Documentation for texlive-frame"
DESCRIPTION = "This package includes the documentation for texlive-frame"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn18312"

RPM_NAME = "texlive-frame-doc-2023.209.1.0svn18312-53.1.noarch.rpm"
RPM_HASH = "4d1837587e86e4baf3d9d669d4b737a6a261ad7d49c153f5333eb0c5f1f05ffaffef1ceb7904c47b9f7b31c39f13229229b9bfaea2f1daaa70198b7b91824c24"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frame-doc"

RDEPENDS:${PN} += ""

inherit rpm
