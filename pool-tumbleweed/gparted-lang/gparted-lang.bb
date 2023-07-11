SUMMARY = "Translations for package gparted"
DESCRIPTION = "Provides translations for the 'gparted' package."
LICENSE = "GPL-2.0-only"

PV = "1.5.0"

RPM_NAME = "gparted-lang-1.5.0-1.4.noarch.rpm"
RPM_HASH = "f8bea0405d8708292788f6eed601db061cd5a90d488d723b2834d5fa2a9fc12713cbfec74523fab23e21ac65a699a30da79d2c10fae378cca4476526a84a1cba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gparted-lang \
gparted-lang-all \
locale-gparted-ar \
locale-gparted-be \
locale-gparted-bg \
locale-gparted-br \
locale-gparted-bs \
locale-gparted-ca \
locale-gparted-ca@valencia \
locale-gparted-cs \
locale-gparted-da \
locale-gparted-de \
locale-gparted-dz \
locale-gparted-el \
locale-gparted-en-CA \
locale-gparted-en-GB \
locale-gparted-eo \
locale-gparted-es \
locale-gparted-et \
locale-gparted-eu \
locale-gparted-fa \
locale-gparted-fi \
locale-gparted-fr \
locale-gparted-fur \
locale-gparted-gd \
locale-gparted-gl \
locale-gparted-gu \
locale-gparted-he \
locale-gparted-hr \
locale-gparted-hu \
locale-gparted-id \
locale-gparted-is \
locale-gparted-it \
locale-gparted-ja \
locale-gparted-ka \
locale-gparted-kk \
locale-gparted-ko \
locale-gparted-lt \
locale-gparted-lv \
locale-gparted-mk \
locale-gparted-ml \
locale-gparted-nb \
locale-gparted-ne \
locale-gparted-nl \
locale-gparted-nn \
locale-gparted-oc \
locale-gparted-pa \
locale-gparted-pl \
locale-gparted-pt \
locale-gparted-pt-BR \
locale-gparted-ro \
locale-gparted-ru \
locale-gparted-si \
locale-gparted-sk \
locale-gparted-sl \
locale-gparted-sr \
locale-gparted-sr@latin \
locale-gparted-sv \
locale-gparted-te \
locale-gparted-th \
locale-gparted-tr \
locale-gparted-uk \
locale-gparted-vi \
locale-gparted-zh-CN \
locale-gparted-zh-HK \
locale-gparted-zh-TW"

RDEPENDS:${PN} += "gparted"

inherit rpm
