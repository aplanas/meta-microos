SUMMARY = "Translations for package picard"
DESCRIPTION = "Provides translations for the 'picard' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.1"

RPM_NAME = "picard-lang-2.9.1-1.1.noarch.rpm"
RPM_HASH = "e1e3f7f43969433ae1edae17acd1ff0f7a3efd48469a0044306451fa6141a16591b24a319c22ce5af16ed541912867e1acd28fe50e7f9ceac6f621589c20d53a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-picard-af \
locale-picard-ar \
locale-picard-ast \
locale-picard-bg \
locale-picard-bn \
locale-picard-ca \
locale-picard-cs \
locale-picard-cy \
locale-picard-da \
locale-picard-de \
locale-picard-de-CH \
locale-picard-el \
locale-picard-en-AU \
locale-picard-en-CA \
locale-picard-en-GB \
locale-picard-eo \
locale-picard-es \
locale-picard-et \
locale-picard-fa \
locale-picard-fi \
locale-picard-fr \
locale-picard-fr-CA \
locale-picard-gl \
locale-picard-he \
locale-picard-hi \
locale-picard-hr \
locale-picard-hu \
locale-picard-id \
locale-picard-is \
locale-picard-it \
locale-picard-ja \
locale-picard-kn \
locale-picard-ko \
locale-picard-lt \
locale-picard-mr \
locale-picard-nb \
locale-picard-nds \
locale-picard-ne \
locale-picard-nl \
locale-picard-nl-BE \
locale-picard-oc \
locale-picard-pa \
locale-picard-pl \
locale-picard-pt \
locale-picard-pt-BR \
locale-picard-pt-PT \
locale-picard-ro \
locale-picard-ru \
locale-picard-sk \
locale-picard-sl \
locale-picard-sq \
locale-picard-sr \
locale-picard-sv \
locale-picard-ta \
locale-picard-te \
locale-picard-tr \
locale-picard-uk \
locale-picard-vi \
locale-picard-zh \
locale-picard-zh-CN \
locale-picard-zh-TW \
picard-lang \
picard-lang-all"

RDEPENDS:${PN} += "picard"

inherit rpm
