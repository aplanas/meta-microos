SUMMARY = "Translations for package file-roller"
DESCRIPTION = "Provides translations for the 'file-roller' package."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "file-roller-lang-43.0-1.4.noarch.rpm"
RPM_HASH = "43c58da61acf406c449ba5ddc43fe507ecc9d397a81cbd270074441358b334326847c12aa256770a629e69b7b1d6c362b3f1865e98ab59f55bc8d07ebb092f70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "file-roller-lang \
file-roller-lang-all \
locale-file-roller-af \
locale-file-roller-ar \
locale-file-roller-as \
locale-file-roller-ast \
locale-file-roller-az \
locale-file-roller-be \
locale-file-roller-be@latin \
locale-file-roller-bg \
locale-file-roller-bn \
locale-file-roller-bn-IN \
locale-file-roller-br \
locale-file-roller-bs \
locale-file-roller-ca \
locale-file-roller-ca@valencia \
locale-file-roller-cs \
locale-file-roller-cy \
locale-file-roller-da \
locale-file-roller-de \
locale-file-roller-dz \
locale-file-roller-el \
locale-file-roller-en-CA \
locale-file-roller-en-GB \
locale-file-roller-en@shaw \
locale-file-roller-eo \
locale-file-roller-es \
locale-file-roller-et \
locale-file-roller-eu \
locale-file-roller-fa \
locale-file-roller-fi \
locale-file-roller-fr \
locale-file-roller-fur \
locale-file-roller-ga \
locale-file-roller-gd \
locale-file-roller-gl \
locale-file-roller-gu \
locale-file-roller-he \
locale-file-roller-hi \
locale-file-roller-hr \
locale-file-roller-hu \
locale-file-roller-id \
locale-file-roller-is \
locale-file-roller-it \
locale-file-roller-ja \
locale-file-roller-ka \
locale-file-roller-kk \
locale-file-roller-km \
locale-file-roller-kn \
locale-file-roller-ko \
locale-file-roller-lt \
locale-file-roller-lv \
locale-file-roller-mai \
locale-file-roller-mk \
locale-file-roller-ml \
locale-file-roller-mr \
locale-file-roller-ms \
locale-file-roller-nb \
locale-file-roller-nds \
locale-file-roller-ne \
locale-file-roller-nl \
locale-file-roller-nn \
locale-file-roller-oc \
locale-file-roller-or \
locale-file-roller-pa \
locale-file-roller-pl \
locale-file-roller-pt \
locale-file-roller-pt-BR \
locale-file-roller-ro \
locale-file-roller-ru \
locale-file-roller-si \
locale-file-roller-sk \
locale-file-roller-sl \
locale-file-roller-sq \
locale-file-roller-sr \
locale-file-roller-sr@ije \
locale-file-roller-sr@latin \
locale-file-roller-sv \
locale-file-roller-ta \
locale-file-roller-te \
locale-file-roller-th \
locale-file-roller-tr \
locale-file-roller-ug \
locale-file-roller-uk \
locale-file-roller-vi \
locale-file-roller-zh-CN \
locale-file-roller-zh-HK \
locale-file-roller-zh-TW"

RDEPENDS:${PN} += "file-roller"

inherit rpm
