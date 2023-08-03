SUMMARY = "Documentation for texlive-purifyeps"
DESCRIPTION = "This package includes the documentation for texlive-purifyeps"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn29725"

RPM_NAME = "texlive-purifyeps-doc-2023.209.1.1svn29725-54.1.noarch.rpm"
RPM_HASH = "8c66966a17f2e1a1cb984faf13599211cd9ee64cf8cd971d8bc9a1ac7d2418509a0d603df9d39b945756e517803b5fd181331bb9fc9f20fb57edbdac9fb79ec5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-purifyeps.1 \
texlive-purifyeps-doc"

RDEPENDS:${PN} += ""

inherit rpm
