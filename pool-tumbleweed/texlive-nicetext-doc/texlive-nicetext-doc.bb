SUMMARY = "Documentation for texlive-nicetext"
DESCRIPTION = "This package includes the documentation for texlive-nicetext"
LICENSE = "LPPL-1.0"

PV = "2023.201.r0.67svn38914"

RPM_NAME = "texlive-nicetext-doc-2023.201.r0.67svn38914-54.1.noarch.rpm"
RPM_HASH = "4d15780206b8f00070ab222cbc6d69c71694f2cb3794360cc86ec0388d780fe2ff877afb62f1f664b3c30a49b0f6d27f5c5965c2623f7a00ba8e30e8573ef532"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nicetext-doc"

RDEPENDS:${PN} += ""

inherit rpm
