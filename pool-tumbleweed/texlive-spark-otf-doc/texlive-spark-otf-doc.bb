SUMMARY = "Documentation for texlive-spark-otf"
DESCRIPTION = "This package includes the documentation for texlive-spark-otf"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.05asvn62481"

RPM_NAME = "texlive-spark-otf-doc-2023.209.0.0.05asvn62481-58.1.noarch.rpm"
RPM_HASH = "11991194d8a739b2b7a5a827ed883d781cf216f68ce0962eee04e6cb5b23d3b16b1c3d06df6e736d04af3bc9219cc94b792561784c7e7d2a9504257c66f800cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-spark-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
