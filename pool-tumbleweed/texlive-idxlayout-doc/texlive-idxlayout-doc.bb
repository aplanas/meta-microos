SUMMARY = "Documentation for texlive-idxlayout"
DESCRIPTION = "This package includes the documentation for texlive-idxlayout"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4dsvn25821"

RPM_NAME = "texlive-idxlayout-doc-2023.209.0.0.4dsvn25821-54.1.noarch.rpm"
RPM_HASH = "e56897aedb8d9bd6d1fadf1f4200402faae9d5c322a80998978eeaa689f364b979a521126eb6ab1abdfc98e8597a76b5454d1ef6da3c31008e78a29d7dd31f62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-idxlayout-doc-en \
texlive-idxlayout-doc"

RDEPENDS:${PN} += ""

inherit rpm
