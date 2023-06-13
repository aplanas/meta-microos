SUMMARY = "Documentation for texlive-german"
DESCRIPTION = "This package includes the documentation for texlive-german"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.5esvn42428"

RPM_NAME = "texlive-german-doc-2023.201.2.5esvn42428-52.1.noarch.rpm"
RPM_HASH = "a4a6034b9b333224b04991fc71c524043feaadf2c2d83cc1eaef3721ff7f0b20701b40ea2b89b0c00cef9b4cb9293d41fa5b6e6aee0680d98d4da98d80481b9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-german-doc:de) \
texlive-german-doc"

RDEPENDS:${PN} += ""

inherit rpm
