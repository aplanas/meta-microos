SUMMARY = "Documentation for texlive-luamplib"
DESCRIPTION = "This package includes the documentation for texlive-luamplib"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.2.23.0svn61587"

RPM_NAME = "texlive-luamplib-doc-2023.208.2.23.0svn61587-53.1.noarch.rpm"
RPM_HASH = "8af04af47972effbe916e8a8154533f0f16edd5f8b027fce2c78db7db9a265c0e8debc45de48648e2682823d3e96f0be3f35cd62cd002e8586f7c79e6a6b1902"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luamplib-doc"

RDEPENDS:${PN} += ""

inherit rpm
