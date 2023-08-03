SUMMARY = "Documentation for texlive-tikz-network"
DESCRIPTION = "This package includes the documentation for texlive-tikz-network"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn51884"

RPM_NAME = "texlive-tikz-network-doc-2023.209.1.1svn51884-53.1.noarch.rpm"
RPM_HASH = "239d93a79c2631c27bd6b06d2aab04ad78a2b1d724c922e7cbc2acc8f2a722677449722beb2377b06c40e8a733d53c5b35bd5c456c13d414a5185a4f920de992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-network-doc"

RDEPENDS:${PN} += ""

inherit rpm
