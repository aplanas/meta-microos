SUMMARY = "Translations for package bison"
DESCRIPTION = "Provides translations for the 'bison' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.8.2"

RPM_NAME = "bison-lang-3.8.2-3.4.noarch.rpm"
RPM_HASH = "b030e08c8fa181713aa213a21d2fdc45f3f2c5cb56d12fd4b1db8655d4b14dc69c4c611a20a7814d4571db20ed550136705e815b61e6c51831c8cb5eea33d929"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bison-lang \
bison-lang-all \
locale-bison-af \
locale-bison-ast \
locale-bison-be \
locale-bison-bg \
locale-bison-ca \
locale-bison-cs \
locale-bison-da \
locale-bison-de \
locale-bison-el \
locale-bison-eo \
locale-bison-es \
locale-bison-et \
locale-bison-eu \
locale-bison-fi \
locale-bison-fr \
locale-bison-ga \
locale-bison-gl \
locale-bison-hr \
locale-bison-hu \
locale-bison-ia \
locale-bison-id \
locale-bison-it \
locale-bison-ja \
locale-bison-ko \
locale-bison-lt \
locale-bison-lv \
locale-bison-ms \
locale-bison-nb \
locale-bison-nl \
locale-bison-pl \
locale-bison-pt \
locale-bison-pt-BR \
locale-bison-ro \
locale-bison-ru \
locale-bison-sk \
locale-bison-sl \
locale-bison-sq \
locale-bison-sr \
locale-bison-sv \
locale-bison-ta \
locale-bison-th \
locale-bison-tr \
locale-bison-uk \
locale-bison-vi \
locale-bison-zh-CN \
locale-bison-zh-TW"

RDEPENDS:${PN} += "bison"

inherit rpm
