SUMMARY = "Documentation of Gammu"
DESCRIPTION = "This package contains the manual for gammu."
LICENSE = "GPL-2.0-only"

PV = "1.42.0"

RPM_NAME = "gammu-doc-1.42.0-4.7.noarch.rpm"
RPM_HASH = "184dbacc76d3a2689072530e1c16c4cf6de778d42dcac321ce148d2226286a0c1c568b97031f2e65fa6bb9f31743719abafa747f590e453c2e00f94a69a28bb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gammu-doc"

RDEPENDS:${PN} += ""

inherit rpm
