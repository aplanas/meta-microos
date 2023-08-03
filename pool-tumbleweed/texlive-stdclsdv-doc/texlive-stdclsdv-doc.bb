SUMMARY = "Documentation for texlive-stdclsdv"
DESCRIPTION = "This package includes the documentation for texlive-stdclsdv"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn15878"

RPM_NAME = "texlive-stdclsdv-doc-2023.209.1.1asvn15878-58.1.noarch.rpm"
RPM_HASH = "fcded790ee2ed87d0c2fd84c0d2a371db27179c68636600841744e1318ad2e9ca5cf8fa7b9860a17823d9ac8d95140ed1b79eadb024760cc4d6647daeb9a2dfc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-stdclsdv-doc"

RDEPENDS:${PN} += ""

inherit rpm
