SUMMARY = "Documentation for texlive-randbild"
DESCRIPTION = "This package includes the documentation for texlive-randbild"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-randbild-doc-2023.209.0.0.2svn15878-54.2.noarch.rpm"
RPM_HASH = "991ae06c90ab4de7ebca321b45c6fa53657b8d26d27b2fa5f851bd5cd1d74b49901799bcbfab3ecf3f142e62b4398dfc1a2f62f9c9091da0ac1f8d07b5bb85fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-randbild-doc-de \
texlive-randbild-doc"

RDEPENDS:${PN} += ""

inherit rpm
