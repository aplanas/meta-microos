SUMMARY = "Documentation for texlive-eqell"
DESCRIPTION = "This package includes the documentation for texlive-eqell"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn22931"

RPM_NAME = "texlive-eqell-doc-2023.209.svn22931-54.2.noarch.rpm"
RPM_HASH = "beae05c847b1b143ea1778bc5a32c6ad6b7addafbb78b46a3b1047b0e54679792feae6deaa996172a06e3bdb5716283ed8dc17174180e9802ed32dfbd6e9da1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eqell-doc"

RDEPENDS:${PN} += ""

inherit rpm
