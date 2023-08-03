SUMMARY = "Documentation for texlive-undolabl"
DESCRIPTION = "This package includes the documentation for texlive-undolabl"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0msvn65846"

RPM_NAME = "texlive-undolabl-doc-2023.209.1.0msvn65846-54.1.noarch.rpm"
RPM_HASH = "4e7d0589ed36e274e1814e6f16cc6300bc675e2dda1d6510a2e2da934a3f80b4bd2c520cd02c7c3603106606e4d38a2a1124fb4871d56294cee13b2132c52c38"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-undolabl-doc"

RDEPENDS:${PN} += ""

inherit rpm
