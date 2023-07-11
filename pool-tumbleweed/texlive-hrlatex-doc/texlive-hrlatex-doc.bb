SUMMARY = "Documentation for texlive-hrlatex"
DESCRIPTION = "This package includes the documentation for texlive-hrlatex"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.23svn18020"

RPM_NAME = "texlive-hrlatex-doc-2023.208.0.0.23svn18020-53.1.noarch.rpm"
RPM_HASH = "732bdc62bffa87e135ca49d035e304ce84d3b0e8e240c668a3e4933a0dded3e0607aa8d48c2527f7d264cd695196f80f50feff448e9eea252e1f1faa63df87ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hrlatex-doc-hr \
texlive-hrlatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
