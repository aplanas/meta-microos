SUMMARY = "Translations for package torbrowser-launcher"
DESCRIPTION = "Provides translations for the 'torbrowser-launcher' package."
LICENSE = "MIT"

PV = "0.3.6"

RPM_NAME = "torbrowser-launcher-lang-0.3.6-1.3.noarch.rpm"
RPM_HASH = "507bbdd96516942405194d8b86cfabb19b12a85f23d9b91663914c3d904c4cdb9768e4006f5b02810789b225928ca67467558708b9a0560586be1c204e428fc4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-torbrowser-launcher-be \
locale-torbrowser-launcher-cs \
locale-torbrowser-launcher-da \
locale-torbrowser-launcher-de \
locale-torbrowser-launcher-fr \
locale-torbrowser-launcher-hr \
locale-torbrowser-launcher-hu \
locale-torbrowser-launcher-nl \
locale-torbrowser-launcher-pl \
locale-torbrowser-launcher-pt-BR \
locale-torbrowser-launcher-ru \
locale-torbrowser-launcher-sv \
locale-torbrowser-launcher-tr \
locale-torbrowser-launcher-zh-TW \
torbrowser-launcher-lang \
torbrowser-launcher-lang-all"

RDEPENDS:${PN} += "torbrowser-launcher"

inherit rpm
