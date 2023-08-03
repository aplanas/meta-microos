SUMMARY = "Documentation for texlive-rectopma"
DESCRIPTION = "This package includes the documentation for texlive-rectopma"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn19980"

RPM_NAME = "texlive-rectopma-doc-2023.209.svn19980-54.1.noarch.rpm"
RPM_HASH = "800bbfcf23726262d5b864a69de3f87bd8ff34708ee947d27e6f39a31a24dc42fa0239d8ed3eb2d023b6f56fb0e36bb833426487b0a29aa868e585c67054ac6f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rectopma-doc"

RDEPENDS:${PN} += ""

inherit rpm
