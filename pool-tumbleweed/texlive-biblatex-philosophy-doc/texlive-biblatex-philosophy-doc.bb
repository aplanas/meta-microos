SUMMARY = "Documentation for texlive-biblatex-philosophy"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-philosophy"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.8gsvn64414"

RPM_NAME = "texlive-biblatex-philosophy-doc-2023.209.1.9.8gsvn64414-54.1.noarch.rpm"
RPM_HASH = "cb2d4703dec59c13b912c029a9a3399274389993f76f708d5ef60d25a07f32bfadfca60b8eba51460c3de555709904923b86a90f5f8b770d4417a170d67b9bfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-philosophy-doc"

RDEPENDS:${PN} += ""

inherit rpm
