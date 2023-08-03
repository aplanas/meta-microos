SUMMARY = "Documentation for texlive-twemojis"
DESCRIPTION = "This package includes the documentation for texlive-twemojis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.1_twemoji_v14.0.1svn62930"

RPM_NAME = "texlive-twemojis-doc-2023.209.1.3.1_twemoji_v14.0.1svn62930-53.1.noarch.rpm"
RPM_HASH = "abd51e5a826e963e14661a9bfc6e43b57317cf143c5ed3b728f5eb4828308324c5ccd4f44e0ec7d528203a9abeb366118cf7c10442176f4e38d189348eb3a162"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-twemojis-doc"

RDEPENDS:${PN} += ""

inherit rpm
