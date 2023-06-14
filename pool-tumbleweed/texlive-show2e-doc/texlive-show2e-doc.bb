SUMMARY = "Documentation for texlive-show2e"
DESCRIPTION = "This package includes the documentation for texlive-show2e"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-show2e-doc-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "b52a1add17c8032c86d7a9e469a983203c636b2c2de9c216c56e2dfa43b7025426db1551fd509c3c4fbcbb2ca57f2dc8d54169d22bd8f4e1a04561698cb27d9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-show2e-doc-fr;en \
texlive-show2e-doc"

RDEPENDS:${PN} += ""

inherit rpm
