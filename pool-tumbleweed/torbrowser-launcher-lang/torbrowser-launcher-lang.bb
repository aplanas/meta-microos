SUMMARY = "Translations for package torbrowser-launcher"
DESCRIPTION = "Provides translations for the 'torbrowser-launcher' package."
LICENSE = "MIT"

PV = "0.3.6"

RPM_NAME = "torbrowser-launcher-lang-0.3.6-1.2.noarch.rpm"
RPM_HASH = "f0422ef6e8b1e20f5ba8b480adcfd2ad49c8e5d5d4082d8fee9077a7f778365dd2c8f6e3add206b3f903cbdc0d5fdb6915037418a9f2b09c91a1fada96bab77d"
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
