SUMMARY = "Documentation for texlive-geschichtsfrkl"
DESCRIPTION = "This package includes the documentation for texlive-geschichtsfrkl"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn42121"

RPM_NAME = "texlive-geschichtsfrkl-doc-2023.209.1.4svn42121-53.1.noarch.rpm"
RPM_HASH = "9b11ff28e9aa934d96b7b7d76b08e29ddfa92f1ddf05a0c65ba587448e9686fb5d89bfc25c76543c33d77466a12860c6f916293310bbaa4b5b3ec8145e40970d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-geschichtsfrkl-doc-de \
texlive-geschichtsfrkl-doc"

RDEPENDS:${PN} += ""

inherit rpm
