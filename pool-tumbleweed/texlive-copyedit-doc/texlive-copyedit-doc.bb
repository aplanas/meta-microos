SUMMARY = "Documentation for texlive-copyedit"
DESCRIPTION = "This package includes the documentation for texlive-copyedit"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn37928"

RPM_NAME = "texlive-copyedit-doc-2023.209.1.6svn37928-55.1.noarch.rpm"
RPM_HASH = "f83347828faf7f10ad73eead258f671c6d468157bc2fb82cbe24e04184dc6f3a77594674497935a35017ab93f00ae12fce3e60bab8db1d0e635691b689c3ecc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-copyedit-doc"

RDEPENDS:${PN} += ""

inherit rpm
