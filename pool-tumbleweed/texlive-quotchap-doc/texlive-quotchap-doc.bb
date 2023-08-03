SUMMARY = "Documentation for texlive-quotchap"
DESCRIPTION = "This package includes the documentation for texlive-quotchap"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn56926"

RPM_NAME = "texlive-quotchap-doc-2023.209.1.3svn56926-54.1.noarch.rpm"
RPM_HASH = "100791522fb33ae19519b345861dd26c203c64e81b6f6c86822238018b40059b1064709b5738a0ae25bf8cd86c5d617401ca50425716e9237cec367a2a917a10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quotchap-doc"

RDEPENDS:${PN} += ""

inherit rpm
