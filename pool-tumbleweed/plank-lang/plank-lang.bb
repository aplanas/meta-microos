SUMMARY = "Translations for package plank"
DESCRIPTION = "Provides translations for the 'plank' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.11.89"

RPM_NAME = "plank-lang-0.11.89-2.4.noarch.rpm"
RPM_HASH = "6921fc6474e061332a9d15e0ac141bb5a216d6ee5cb1f08693a6b409fbe81eda085e677bf852a8fad45ad27ef3b4407ccfe2266ca45b33a50b55fc0957059d4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plank-ar \
locale-plank-bg \
locale-plank-bs \
locale-plank-ca \
locale-plank-cs \
locale-plank-da \
locale-plank-de \
locale-plank-el \
locale-plank-en-AU \
locale-plank-en-CA \
locale-plank-en-GB \
locale-plank-eo \
locale-plank-es \
locale-plank-et \
locale-plank-eu \
locale-plank-fi \
locale-plank-fr \
locale-plank-ga \
locale-plank-gd \
locale-plank-gl \
locale-plank-he \
locale-plank-hr \
locale-plank-hu \
locale-plank-id \
locale-plank-it \
locale-plank-ja \
locale-plank-ka \
locale-plank-ko \
locale-plank-lt \
locale-plank-lv \
locale-plank-ml \
locale-plank-ms \
locale-plank-nb \
locale-plank-ne \
locale-plank-nl \
locale-plank-nn \
locale-plank-pl \
locale-plank-pt \
locale-plank-pt-BR \
locale-plank-ro \
locale-plank-ru \
locale-plank-sk \
locale-plank-sl \
locale-plank-sq \
locale-plank-sr \
locale-plank-sr@latin \
locale-plank-sv \
locale-plank-ta \
locale-plank-te \
locale-plank-th \
locale-plank-tr \
locale-plank-uk \
locale-plank-vi \
locale-plank-zh-CN \
locale-plank-zh-TW \
plank-lang \
plank-lang-all"

RDEPENDS:${PN} += "plank"

inherit rpm
