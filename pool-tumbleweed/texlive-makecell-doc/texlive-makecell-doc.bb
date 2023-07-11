SUMMARY = "Documentation for texlive-makecell"
DESCRIPTION = "This package includes the documentation for texlive-makecell"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1esvn15878"

RPM_NAME = "texlive-makecell-doc-2023.208.0.0.1esvn15878-53.1.noarch.rpm"
RPM_HASH = "f7772e9df1bdb93a03d13cdbd3cdeb5698a813ebd8ed12cbf50bca3eee581ddb20a5e042564e4c69814f72b3d61736b0bafd976285c1b61222b788d4b604ad0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-makecell-doc-ru;en \
texlive-makecell-doc"

RDEPENDS:${PN} += ""

inherit rpm
