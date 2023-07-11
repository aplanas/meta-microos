SUMMARY = "Translations for package picard"
DESCRIPTION = "Provides translations for the 'picard' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.5"

RPM_NAME = "picard-lang-2.8.5-2.1.noarch.rpm"
RPM_HASH = "f1206f45a35c7ab1acaf3a0beab8a26389b8c91d8d06f3839009f989af88048fbc918a58ac4f5d1d05b45f08f8a69b8e1d8a55b6b14901a8e454dc8dc995fc24"
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
locale-picard-en \
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
