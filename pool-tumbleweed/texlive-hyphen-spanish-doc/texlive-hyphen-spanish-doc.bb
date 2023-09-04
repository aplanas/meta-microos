SUMMARY = "Documentation for texlive-hyphen-spanish"
DESCRIPTION = "This package includes the documentation for texlive-hyphen-spanish"
LICENSE = "LPPL-1.0"

PV = "2023.209.5.0svn58652"

RPM_NAME = "texlive-hyphen-spanish-doc-2023.209.5.0svn58652-54.1.noarch.rpm"
RPM_HASH = "f85ac7dd8710ab98582cd4fe46f4e3e1f2200680ff2967ea85987390c7d44681e29f058e9dcea833842e8c034b02903c19e3512005bd981a58d28aeb6a24208f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hyphen-spanish-doc-es \
texlive-hyphen-spanish-doc"

RDEPENDS:${PN} += ""

inherit rpm
