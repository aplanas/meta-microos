SUMMARY = "Documentation for texlive-biblatex-apa6"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-apa6"
LICENSE = "LPPL-1.0"

PV = "2023.209.8.5svn56209"

RPM_NAME = "texlive-biblatex-apa6-doc-2023.209.8.5svn56209-54.1.noarch.rpm"
RPM_HASH = "1cf2ce253dfa89c76f002cb53301fc722c871d62f73db4d36dee455f1f2d77bef8eaa883ef2ea0f5693114af16e723c7d306f17d3b56accca595258fb7a39b7e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-apa6-doc"

RDEPENDS:${PN} += ""

inherit rpm
