SUMMARY = "Translations for package falkon"
DESCRIPTION = "Provides translations for the 'falkon' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.3"

RPM_NAME = "falkon-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "f07fd0edf7f8123d82d60f6a0d86e9626bf22e7434a9e887633c7b6d6ca763446f050bacd5b96b96134804c7e715540bca2b96495e3ba3bdb02a5a8b6b8411cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "falkon-lang \
falkon-lang-all \
locale-falkon-ar \
locale-falkon-az \
locale-falkon-bg \
locale-falkon-ca \
locale-falkon-ca@valencia \
locale-falkon-cs \
locale-falkon-da \
locale-falkon-de \
locale-falkon-el \
locale-falkon-en \
locale-falkon-en-GB \
locale-falkon-es \
locale-falkon-et \
locale-falkon-eu \
locale-falkon-fa \
locale-falkon-fi \
locale-falkon-fr \
locale-falkon-gl \
locale-falkon-hu \
locale-falkon-ia \
locale-falkon-id \
locale-falkon-is \
locale-falkon-it \
locale-falkon-ja \
locale-falkon-ka \
locale-falkon-ko \
locale-falkon-lt \
locale-falkon-lv \
locale-falkon-nb \
locale-falkon-nl \
locale-falkon-nn \
locale-falkon-pa \
locale-falkon-pl \
locale-falkon-pt \
locale-falkon-pt-BR \
locale-falkon-ro \
locale-falkon-ru \
locale-falkon-sk \
locale-falkon-sl \
locale-falkon-sr \
locale-falkon-sr@ijekavian \
locale-falkon-sr@ijekavianlatin \
locale-falkon-sr@latin \
locale-falkon-sv \
locale-falkon-ta \
locale-falkon-tr \
locale-falkon-uk \
locale-falkon-zh-CN \
locale-falkon-zh-HK \
locale-falkon-zh-TW"

RDEPENDS:${PN} += "falkon"

inherit rpm
