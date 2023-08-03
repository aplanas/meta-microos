SUMMARY = "Documentation for texlive-cnltx"
DESCRIPTION = "This package includes the documentation for texlive-cnltx"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.15svn55265"

RPM_NAME = "texlive-cnltx-doc-2023.209.0.0.15svn55265-54.1.noarch.rpm"
RPM_HASH = "e715574d39f81273ab724010c43e87ec963ecd3d106cb5e133224a9cfbc4c57b4624a1240a18c7461756383142644e9018d39c24a05c4976ad31c74b2d56a9eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cnltx-doc"

RDEPENDS:${PN} += ""

inherit rpm
