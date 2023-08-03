SUMMARY = "Documentation for texlive-scale"
DESCRIPTION = "This package includes the documentation for texlive-scale"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1.2svn15878"

RPM_NAME = "texlive-scale-doc-2023.209.1.1.2svn15878-54.1.noarch.rpm"
RPM_HASH = "089be768f022fffa59eb72939249c898a2f6bca82baa35a60f4c89ae7a8fc0c53d7c9796cabdbde5c7c32aa75d665532f47e1c32f64c0f335f60890483263e55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scale-doc"

RDEPENDS:${PN} += ""

inherit rpm
