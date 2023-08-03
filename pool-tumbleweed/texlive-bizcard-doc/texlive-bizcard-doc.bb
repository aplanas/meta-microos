SUMMARY = "Documentation for texlive-bizcard"
DESCRIPTION = "This package includes the documentation for texlive-bizcard"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-bizcard-doc-2023.209.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "cf935d982e5f073403efb1ecc58251884909082737e5cca98eb91ada2339308ed95cc3e2e54c7025594633baf3305ba8544edf5dee6af9362a0a1b10eaa6ceca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bizcard-doc"

RDEPENDS:${PN} += ""

inherit rpm
