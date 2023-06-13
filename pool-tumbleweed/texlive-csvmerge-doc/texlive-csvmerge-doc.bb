SUMMARY = "Documentation for texlive-csvmerge"
DESCRIPTION = "This package includes the documentation for texlive-csvmerge"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.0svn51857"

RPM_NAME = "texlive-csvmerge-doc-2023.204.1.0svn51857-54.1.noarch.rpm"
RPM_HASH = "fec689e35385941053fc545d36fc0cd2ccd508a4273229ffe9023f5a15d800fa2b121c754a886add10f4459094ea9b895ac1f43a6f8df070b68e32ea7d7d27be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-csvmerge-doc"

RDEPENDS:${PN} += ""

inherit rpm
