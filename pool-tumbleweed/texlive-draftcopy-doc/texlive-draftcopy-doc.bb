SUMMARY = "Documentation for texlive-draftcopy"
DESCRIPTION = "This package includes the documentation for texlive-draftcopy"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.16svn15878"

RPM_NAME = "texlive-draftcopy-doc-2023.209.2.16svn15878-53.1.noarch.rpm"
RPM_HASH = "bd4843f094ca80d4834b8b49a942e4e2a7eb5c15cd701a6fe17e434f287388130a2d6d876cad998c50903886321c2bc06d5c7416668a3e897287c196beaccf47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-draftcopy-doc"

RDEPENDS:${PN} += ""

inherit rpm
