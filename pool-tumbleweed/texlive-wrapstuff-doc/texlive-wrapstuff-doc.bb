SUMMARY = "Documentation for texlive-wrapstuff"
DESCRIPTION = "This package includes the documentation for texlive-wrapstuff"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn64058"

RPM_NAME = "texlive-wrapstuff-doc-2023.209.0.0.3svn64058-53.2.noarch.rpm"
RPM_HASH = "9606f323cb427be451fb0487a01a223b13189e16f895acaf97a1f6618f7167be8e1d2a14d9f86f62d845a613e5008da5defc240df19de20fc0ccfa7dc0b1decb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-wrapstuff-doc-zh \
texlive-wrapstuff-doc"

RDEPENDS:${PN} += ""

inherit rpm
