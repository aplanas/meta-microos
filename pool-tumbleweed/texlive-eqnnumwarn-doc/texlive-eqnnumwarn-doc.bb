SUMMARY = "Documentation for texlive-eqnnumwarn"
DESCRIPTION = "This package includes the documentation for texlive-eqnnumwarn"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn45511"

RPM_NAME = "texlive-eqnnumwarn-doc-2023.201.1.0svn45511-53.1.noarch.rpm"
RPM_HASH = "a6a87fe4dffe77bd722db15d2e5ed9cb5d39eb5ae4108d872004bdde17e098810c9a722d20cc7d0ae2c675d3d4c4854e49a7d8250e348a69c199a3d09dc76561"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqnnumwarn-doc"

RDEPENDS:${PN} += ""

inherit rpm
