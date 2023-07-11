SUMMARY = "Translations for package screencast"
DESCRIPTION = "Provides translations for the 'screencast' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.0"

RPM_NAME = "screencast-lang-1.0.0-2.11.noarch.rpm"
RPM_HASH = "0f01c827ec2fd0b7a40258007e42f34f96063ddaf704197d59e234d9bf0e3327ea0624661e25270789619786c170b18c8cb93002f6d8156e6cd5a445a94f5fba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-screencast-af \
locale-screencast-ar \
locale-screencast-as \
locale-screencast-ast \
locale-screencast-az \
locale-screencast-be \
locale-screencast-bg \
locale-screencast-bn \
locale-screencast-br \
locale-screencast-bs \
locale-screencast-ca \
locale-screencast-cs \
locale-screencast-cy \
locale-screencast-da \
locale-screencast-de \
locale-screencast-dz \
locale-screencast-el \
locale-screencast-en-AU \
locale-screencast-en-CA \
locale-screencast-en-GB \
locale-screencast-eo \
locale-screencast-es \
locale-screencast-et \
locale-screencast-eu \
locale-screencast-fa \
locale-screencast-fi \
locale-screencast-fr \
locale-screencast-fr-CA \
locale-screencast-ga \
locale-screencast-gd \
locale-screencast-gl \
locale-screencast-gu \
locale-screencast-he \
locale-screencast-hi \
locale-screencast-hr \
locale-screencast-hu \
locale-screencast-ia \
locale-screencast-id \
locale-screencast-is \
locale-screencast-it \
locale-screencast-ja \
locale-screencast-ka \
locale-screencast-kk \
locale-screencast-km \
locale-screencast-kn \
locale-screencast-ko \
locale-screencast-lt \
locale-screencast-lv \
locale-screencast-mk \
locale-screencast-ml \
locale-screencast-mr \
locale-screencast-ms \
locale-screencast-nb \
locale-screencast-ne \
locale-screencast-nl \
locale-screencast-nn \
locale-screencast-oc \
locale-screencast-or \
locale-screencast-pa \
locale-screencast-pl \
locale-screencast-pt \
locale-screencast-pt-BR \
locale-screencast-ro \
locale-screencast-ru \
locale-screencast-si \
locale-screencast-sk \
locale-screencast-sl \
locale-screencast-sq \
locale-screencast-sr \
locale-screencast-sv \
locale-screencast-ta \
locale-screencast-te \
locale-screencast-th \
locale-screencast-tr \
locale-screencast-ug \
locale-screencast-uk \
locale-screencast-vi \
locale-screencast-wa \
locale-screencast-zh \
locale-screencast-zh-HK \
locale-screencast-zh-TW \
screencast-lang \
screencast-lang-all"

RDEPENDS:${PN} += "screencast"

inherit rpm
