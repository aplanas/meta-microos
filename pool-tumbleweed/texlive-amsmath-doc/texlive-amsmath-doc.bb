SUMMARY = "Documentation for texlive-amsmath"
DESCRIPTION = "This package includes the documentation for texlive-amsmath"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63514"

RPM_NAME = "texlive-amsmath-doc-2023.201.svn63514-54.1.noarch.rpm"
RPM_HASH = "b426fcd993d125a813873d3be3511b5fed1d6977cc71c4225136c1ddb93c0aaa3ac3f94421089cf5fb6cf50238c89ddaaed9a157a071efb6401f3ddfeb0e35b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-amsmath-doc-en \
texlive-amsmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
