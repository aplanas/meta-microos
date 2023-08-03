SUMMARY = "Documentation for texlive-eskdx"
DESCRIPTION = "This package includes the documentation for texlive-eskdx"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.98svn29235"

RPM_NAME = "texlive-eskdx-doc-2023.209.0.0.98svn29235-53.1.noarch.rpm"
RPM_HASH = "255221d74b2fe170edea17d3573afe22e562c11e3e4c5cdc29c164767984b34b4c57f6d873f8b23c3d6cbb7c4d8e90e9e758a4930fbe21942462692092e74c9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-eskdx-doc-ru \
texlive-eskdx-doc"

RDEPENDS:${PN} += ""

inherit rpm
