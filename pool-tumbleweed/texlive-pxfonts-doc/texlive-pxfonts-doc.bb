SUMMARY = "Documentation for texlive-pxfonts"
DESCRIPTION = "This package includes the documentation for texlive-pxfonts"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-pxfonts-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "84b39017d120be9f638a91a687577c241b5738575a20fcf39523f72661a15ccf49353fbbafb87b6a0567579d33a84fa869d21dcf3b58d121c4f34bddc80716de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
