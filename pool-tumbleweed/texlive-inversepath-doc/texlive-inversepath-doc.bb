SUMMARY = "Documentation for texlive-inversepath"
DESCRIPTION = "This package includes the documentation for texlive-inversepath"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn15878"

RPM_NAME = "texlive-inversepath-doc-2023.201.0.0.2svn15878-52.1.noarch.rpm"
RPM_HASH = "e7a812220a274e3876892c0a1aac9435f28f16a0ea95f298f79fa9c7c19e8dc1f4b27332a52755d091cd5e2d1e478925ebea8ff3d4a392fc93ca568fdccc1b55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-inversepath-doc"

RDEPENDS:${PN} += ""

inherit rpm
