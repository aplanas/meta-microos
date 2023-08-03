SUMMARY = "Documentation for texlive-repere"
DESCRIPTION = "This package includes the documentation for texlive-repere"
LICENSE = "LPPL-1.0"

PV = "2023.209.23.02svn65769"

RPM_NAME = "texlive-repere-doc-2023.209.23.02svn65769-54.1.noarch.rpm"
RPM_HASH = "c2ddd0b5d3d4fe2edcddb12bc6f49867653fdbd4a385ebcae6df1fa35141dc0c5fb4cb4f3a2ba974248a54748b3923c99c88bbe93f12efcde29567be08b9337b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-repere-doc-fr \
texlive-repere-doc"

RDEPENDS:${PN} += ""

inherit rpm
