SUMMARY = "Documentation for texlive-ccfonts"
DESCRIPTION = "This package includes the documentation for texlive-ccfonts"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn61431"

RPM_NAME = "texlive-ccfonts-doc-2023.201.svn61431-52.1.noarch.rpm"
RPM_HASH = "26dcdb37e7589f0183a68242209385a198a00414ab327fee70e2cb46c22f5c258d0bed133fa4135ebc95a6190c97a32ec02032c9ea61c83d8283a70353e25985"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ccfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
