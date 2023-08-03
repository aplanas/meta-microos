SUMMARY = "Documentation for texlive-twemoji-colr"
DESCRIPTION = "This package includes the documentation for texlive-twemoji-colr"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.7.0svn64854"

RPM_NAME = "texlive-twemoji-colr-doc-2023.209.0.0.7.0svn64854-53.1.noarch.rpm"
RPM_HASH = "033ff672d087dfc3a87d7e0151fe076c45bb5f166f42e2a400251c8a5dc8bbcc73f4d81578a631a51653b5e06ee3b6a1b2d97284c41b77dd8531e0c835aac22f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-twemoji-colr-doc"

RDEPENDS:${PN} += ""

inherit rpm
