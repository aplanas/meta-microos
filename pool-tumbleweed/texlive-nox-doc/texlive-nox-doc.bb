SUMMARY = "Documentation for texlive-nox"
DESCRIPTION = "This package includes the documentation for texlive-nox"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn30991"

RPM_NAME = "texlive-nox-doc-2023.209.1.0svn30991-55.1.noarch.rpm"
RPM_HASH = "d07544c42765bf93ff8dabd23bbcc2bd13132ffb5341e917d02d4ca03ed56cec91f52c56841cc448feaa2b2f45b72dd53217a32f3177e0d836954354a6db6f9b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nox-doc-de \
texlive-nox-doc"

RDEPENDS:${PN} += ""

inherit rpm
