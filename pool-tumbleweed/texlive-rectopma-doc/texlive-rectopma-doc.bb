SUMMARY = "Documentation for texlive-rectopma"
DESCRIPTION = "This package includes the documentation for texlive-rectopma"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn19980"

RPM_NAME = "texlive-rectopma-doc-2023.201.svn19980-53.2.noarch.rpm"
RPM_HASH = "f4e89e13ebff907eda60354863a5c74dce2d6b10c5bcd48ec1876af0298f810315d1bf2b1d4997323e02218c9b1780f3896a1ac702f0bc43c8f94335e5339c2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rectopma-doc"

RDEPENDS:${PN} += ""

inherit rpm
