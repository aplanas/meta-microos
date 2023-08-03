SUMMARY = "Documentation for texlive-babel-spanish"
DESCRIPTION = "This package includes the documentation for texlive-babel-spanish"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.0qsvn59367"

RPM_NAME = "texlive-babel-spanish-doc-2023.209.5.0qsvn59367-54.1.noarch.rpm"
RPM_HASH = "bbaca437f412cdbbf777ff01aae38c8ca056636f53f2e5b5dbe3cbc7c406079dbeb2c1031950b30ac49bdc20e2dd162ced807d410e2da1dad7b701249e521894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-babel-spanish-doc-es \
texlive-babel-spanish-doc"

RDEPENDS:${PN} += ""

inherit rpm
