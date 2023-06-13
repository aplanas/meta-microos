SUMMARY = "Suru Plus Dark icon theme"
DESCRIPTION = "A cyberpunkish, elegant, futuristic, Papirus-like icon theme."
LICENSE = "GPL-3.0-or-later"

PV = "25.1"

RPM_NAME = "suru-plus-dark-icon-theme-25.1-2.6.noarch.rpm"
RPM_HASH = "e13a3f9603fc43933705f67a9b4b95c0b05a3b5697b5e2e371a4c61b75729c1e4045a71850ae725d0f28a7e9a0ddca5795a5f89f8358729a30933323d98ecc78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "suru-plus-dark-icon-theme"

RDEPENDS:${PN} += ""

inherit rpm
