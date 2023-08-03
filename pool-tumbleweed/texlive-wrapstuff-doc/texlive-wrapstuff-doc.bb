SUMMARY = "Documentation for texlive-wrapstuff"
DESCRIPTION = "This package includes the documentation for texlive-wrapstuff"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn64058"

RPM_NAME = "texlive-wrapstuff-doc-2023.209.0.0.3svn64058-53.1.noarch.rpm"
RPM_HASH = "8c30ebc7f15b9f5587b578d93cffcd9d641c7998c92a11f00a33cf1ac10ca29abc51f1e0657ffd38d3c7a7e766e933435cd0445e22cde3e3781451c42b39a314"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-wrapstuff-doc-zh \
texlive-wrapstuff-doc"

RDEPENDS:${PN} += ""

inherit rpm
