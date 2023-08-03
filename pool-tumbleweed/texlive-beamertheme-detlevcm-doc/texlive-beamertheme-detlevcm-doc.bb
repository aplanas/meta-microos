SUMMARY = "Documentation for texlive-beamertheme-detlevcm"
DESCRIPTION = "This package includes the documentation for texlive-beamertheme-detlevcm"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.02svn39048"

RPM_NAME = "texlive-beamertheme-detlevcm-doc-2023.209.1.02svn39048-54.1.noarch.rpm"
RPM_HASH = "6de3c5f48cd964572f3c9455c5a5fc09a2fe5236582be11b13075b29affc6e9fb720ab75437a270c6fc927e2476037fe40a02ef1a344a98d48f28e1ed5b221dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-beamertheme-detlevcm-doc"

RDEPENDS:${PN} += ""

inherit rpm
