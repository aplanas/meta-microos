SUMMARY = "Documentation for texlive-caption"
DESCRIPTION = "This package includes the documentation for texlive-caption"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66580"

RPM_NAME = "texlive-caption-doc-2023.209.svn66580-53.1.noarch.rpm"
RPM_HASH = "ebef7874cbc837ab13846148b800be8cad34d0d7c5cda3973db062b7ea75e65c244a88c9ce5c6abdb4ef4e83a5b6691dcc56bc0de005bfe723fe2972d47f8c17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-caption-doc-en \
texlive-caption-doc"

RDEPENDS:${PN} += ""

inherit rpm
