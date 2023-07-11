SUMMARY = "Documentation for texlive-match_parens"
DESCRIPTION = "This package includes the documentation for texlive-match_parens"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.43svn36270"

RPM_NAME = "texlive-match_parens-doc-2023.208.1.43svn36270-53.1.noarch.rpm"
RPM_HASH = "213c1a10af1b4fc68b629cf4a8c702fcea697adcbfc84abfa12ec17d77e72b1cb335a4d2308d3b86a1a99f12129dec0f0f3f716ce49e81eaa157a83511cb83df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-match-parens-doc"

RDEPENDS:${PN} += ""

inherit rpm
