SUMMARY = "Documentation for texlive-mindflow"
DESCRIPTION = "This package includes the documentation for texlive-mindflow"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn65236"

RPM_NAME = "texlive-mindflow-doc-2023.201.svn65236-54.1.noarch.rpm"
RPM_HASH = "c75ec8ea514a6f53d2a5ddbfba1cced014cb7f91b4d5dc1a5b5040c97f9bb9303a4a3420eb964e8b75af0c7d36a31e366e48d36ddf789739221e884b5f9ccb80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mindflow-doc"

RDEPENDS:${PN} += ""

inherit rpm
