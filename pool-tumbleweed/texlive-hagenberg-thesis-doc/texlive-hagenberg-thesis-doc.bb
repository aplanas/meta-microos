SUMMARY = "Documentation for texlive-hagenberg-thesis"
DESCRIPTION = "This package includes the documentation for texlive-hagenberg-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65819"

RPM_NAME = "texlive-hagenberg-thesis-doc-2023.209.svn65819-54.2.noarch.rpm"
RPM_HASH = "b449ad73765a3a298589ed2e729f27c97fb5cdcc5b9c3eda8fac61b07a3ea92503328236809f1244cd8800648dc87a127c703476e666da662bd2623619744aba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hagenberg-thesis-doc-de;en \
texlive-hagenberg-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
