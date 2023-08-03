SUMMARY = "Documentation for texlive-flippdf"
DESCRIPTION = "This package includes the documentation for texlive-flippdf"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn56782"

RPM_NAME = "texlive-flippdf-doc-2023.209.2.0bsvn56782-53.1.noarch.rpm"
RPM_HASH = "98e6f76f90c50e6b9ed6aee616b9df03a39b625fcf2876e02ae7586d1e4fb8581fd39d82f91379f4df9d030e935dce02e6c85cabad0db5ad8e4a00de5b1c4b39"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flippdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
