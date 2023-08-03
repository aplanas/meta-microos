SUMMARY = "Documentation for texlive-biblatex-swiss-legal"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-swiss-legal"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.2asvn64491"

RPM_NAME = "texlive-biblatex-swiss-legal-doc-2023.209.1.1.2asvn64491-54.1.noarch.rpm"
RPM_HASH = "4a2b40c5899192da07de02a8fff878b8658b4279a84b8d99361001801998aa5d7eb88b82f2af443e9577c9c9db61ed64631114bded6a87e5f2faa2c0f6527497"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-biblatex-swiss-legal-doc-fr \
texlive-biblatex-swiss-legal-doc"

RDEPENDS:${PN} += ""

inherit rpm
