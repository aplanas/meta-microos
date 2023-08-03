SUMMARY = "Documentation for texlive-unizgklasa"
DESCRIPTION = "This package includes the documentation for texlive-unizgklasa"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn51647"

RPM_NAME = "texlive-unizgklasa-doc-2023.209.1.0svn51647-54.1.noarch.rpm"
RPM_HASH = "eeec5f8ec48ccb346bcc16a869d1b4cf4489eef2f97d607007339975ad14d6e537b5f2d551c83f094a112e9fcc2aae702244a7a67b5f7d6893fcb2f8c1815633"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-unizgklasa-doc-hr \
texlive-unizgklasa-doc"

RDEPENDS:${PN} += ""

inherit rpm
