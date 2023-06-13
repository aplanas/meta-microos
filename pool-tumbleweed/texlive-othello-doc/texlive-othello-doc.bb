SUMMARY = "Documentation for texlive-othello"
DESCRIPTION = "This package includes the documentation for texlive-othello"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-othello-doc-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "c331bb3ef46135927ffa53d0211ee5c695aa94b12e42b96f202fadd93c922898fecbc655824d00eb5a748355963717f1fe688f684a94baf379e78922fa658854"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-othello-doc"

RDEPENDS:${PN} += ""

inherit rpm
