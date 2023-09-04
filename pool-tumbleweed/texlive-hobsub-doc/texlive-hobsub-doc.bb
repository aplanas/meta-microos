SUMMARY = "Documentation for texlive-hobsub"
DESCRIPTION = "This package includes the documentation for texlive-hobsub"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn52810"

RPM_NAME = "texlive-hobsub-doc-2023.209.svn52810-54.2.noarch.rpm"
RPM_HASH = "01bdcdf65abf96a4b98bdb3326d6ddef02c4dbb4fbcb1cf910bbf1f38fbeed67969e4002e60daa5ad1190f55acd616d08af7ee32d31e877a2b390d3db8ecd54c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hobsub-doc"

RDEPENDS:${PN} += ""

inherit rpm
