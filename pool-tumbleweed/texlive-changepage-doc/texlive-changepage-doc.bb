SUMMARY = "Documentation for texlive-changepage"
DESCRIPTION = "This package includes the documentation for texlive-changepage"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0csvn15878"

RPM_NAME = "texlive-changepage-doc-2023.209.1.0csvn15878-53.1.noarch.rpm"
RPM_HASH = "0a76ccc5ed41809f783e6d7b2d724e303612994e0ac5524dbd6482bce10a1629c767d8ac43a1b52561574318d3eb34e982ac4f9c8a85808b5b59ba2c549bd124"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-changepage-doc"

RDEPENDS:${PN} += ""

inherit rpm
