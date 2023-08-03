SUMMARY = "Documentation for texlive-gbt7714"
DESCRIPTION = "This package includes the documentation for texlive-gbt7714"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1.5svn64633"

RPM_NAME = "texlive-gbt7714-doc-2023.209.2.1.5svn64633-53.1.noarch.rpm"
RPM_HASH = "5e21e9f63425ec0de7c0993e76ef212b390cfc00c7f605764c53e801eb03393f929ddc25da4e6ec977e8fbd2654d1f8c14b4656b0c06c13a11b4fd4c50c0f3cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-gbt7714-doc-zh \
texlive-gbt7714-doc"

RDEPENDS:${PN} += ""

inherit rpm
