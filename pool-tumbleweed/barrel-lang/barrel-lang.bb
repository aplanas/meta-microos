SUMMARY = "Languages for package barrel"
DESCRIPTION = "Provides translations to the package barrel"
LICENSE = "GPL-2.0-only"

PV = "0.2.1"

RPM_NAME = "barrel-lang-0.2.1-1.1.noarch.rpm"
RPM_HASH = "e449e6283fb25d9303cb4470a4ce194de563a2b6481924f97753aec3c6f433d3da22cda5651390b4f74d629540e2fd8a5c83235214e765e2b8189d487b2e01e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "barrel-lang \
barrel-lang-all \
locale-barrel-ca \
locale-barrel-cs \
locale-barrel-da \
locale-barrel-de \
locale-barrel-es \
locale-barrel-fr \
locale-barrel-it \
locale-barrel-ja \
locale-barrel-mk \
locale-barrel-pt-BR \
locale-barrel-zh-CN \
locale-barrel-zh-TW"

RDEPENDS:${PN} += ""

inherit rpm
